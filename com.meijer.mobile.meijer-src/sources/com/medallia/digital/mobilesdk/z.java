package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.appcompat.app.c;

/* loaded from: classes8.dex */
public class z extends c.a {
    public z(Context context, int i10, String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        super(context, i10);
        a(str, str2, str3, str4, str5, onClickListener, onClickListener2, onClickListener3, onCancelListener);
    }

    private void a(String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        if (!TextUtils.isEmpty(str4)) {
            try {
                setTitle(str4);
            } catch (Exception e10) {
                a4.b(e10.getMessage());
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            try {
                setMessage(str5);
            } catch (Exception e11) {
                a4.b(e11.getMessage());
            }
        }
        if (onClickListener != null) {
            try {
                setPositiveButton(str, onClickListener);
            } catch (Exception e12) {
                a4.b(e12.getMessage());
            }
        }
        if (onClickListener2 != null) {
            try {
                setNegativeButton(str2, onClickListener2);
            } catch (Exception e13) {
                a4.b(e13.getMessage());
            }
        }
        if (onClickListener3 != null) {
            try {
                setNeutralButton(str3, onClickListener3);
            } catch (Exception e14) {
                a4.b(e14.getMessage());
            }
        }
        if (onCancelListener != null) {
            try {
                setOnCancelListener(onCancelListener);
            } catch (Exception e15) {
                a4.b(e15.getMessage());
            }
        }
    }
}
