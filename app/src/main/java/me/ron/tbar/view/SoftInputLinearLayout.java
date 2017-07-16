package me.ron.tbar.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.LinearLayout;

import me.ron.tbar.util.RuntimeUtil;

public class SoftInputLinearLayout extends LinearLayout {
    public SoftInputLinearLayout(Context context) {
        super(context);
    }

    public SoftInputLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SoftInputLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {
        if(RuntimeUtil.theVersionGreaterThanKitKat()) {
            insets.left = 0;
            insets.top = 0;
            insets.right = 0;
        }
        return super.fitSystemWindows(insets);
    }

    @Override
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        if(RuntimeUtil.theVersionGreaterThanKitKat()) {
            return super.onApplyWindowInsets(insets.replaceSystemWindowInsets(0, 0, 0, insets.getSystemWindowInsetBottom()));
        } else {
            return insets;
        }
    }
}