package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f47358a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f47359b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f47360c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f47361d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0975a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f47362a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f47363b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f47364c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f47365d;

        public a a() {
            return new a(this.f47362a, this.f47363b, this.f47364c, this.f47365d);
        }

        public C0975a b(int i10) {
            this.f47364c = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        public C0975a c(int i10) {
            this.f47362a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f47358a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f47359b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f47360c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f47361d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f47358a = num;
        this.f47359b = num2;
        this.f47360c = num3;
        this.f47361d = num4;
    }
}
