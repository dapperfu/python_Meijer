package Mc;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* renamed from: Mc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4101b {

    /* renamed from: a, reason: collision with root package name */
    private final Ec.e[] f19206a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19207b;

    private static Ec.e[] c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        Ec.e[] eVarArr = new Ec.e[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    eVarArr[i10] = new Ec.e("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                eVarArr[i10] = Ec.e.f7766i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                eVarArr[i10] = Ec.e.f7768k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                eVarArr[i10] = Ec.e.f7767j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                eVarArr[i10] = Ec.e.f7769l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                eVarArr[i10] = Ec.e.f7770m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                eVarArr[i10] = Ec.e.f7772o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                eVarArr[i10] = Ec.e.f7771n;
            } else if ("FLUID".equals(strTrim)) {
                eVarArr[i10] = Ec.e.f7773p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                eVarArr[i10] = Ec.e.f7776s;
            }
        }
        if (length != 0) {
            return eVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String a() {
        return this.f19207b;
    }

    public final Ec.e[] b(boolean z10) {
        if (z10 || this.f19206a.length == 1) {
            return this.f19206a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public C4101b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, Ec.n.f7790a);
        String string = typedArrayObtainAttributes.getString(Ec.n.f7791b);
        String string2 = typedArrayObtainAttributes.getString(Ec.n.f7792c);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f19206a = c(string);
        } else if (zIsEmpty && !zIsEmpty2) {
            this.f19206a = c(string2);
        } else {
            if (!zIsEmpty) {
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            typedArrayObtainAttributes.recycle();
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        String string3 = typedArrayObtainAttributes.getString(Ec.n.f7793d);
        this.f19207b = string3;
        typedArrayObtainAttributes.recycle();
        if (!TextUtils.isEmpty(string3)) {
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }
}
