package h6;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.medallia.digital.mobilesdk.l3;
import u6.l;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14380a extends Paint {
    public C14380a() {
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public C14380a(int i10) {
        super(i10);
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(l.c(i10, 0, l3.f92484c));
        } else {
            setColor((l.c(i10, 0, l3.f92484c) << 24) | (getColor() & 16777215));
        }
    }

    public C14380a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C14380a(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
