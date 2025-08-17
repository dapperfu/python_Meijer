package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f47134a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f47135b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f47136c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f47137d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0962a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f47138a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f47139b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f47140c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f47141d;

        public a a() {
            return new a(this.f47138a, this.f47139b, this.f47140c, this.f47141d);
        }

        public C0962a b(int i10) {
            this.f47140c = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        public C0962a c(int i10) {
            this.f47138a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f47134a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f47135b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f47136c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f47137d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f47134a = num;
        this.f47135b = num2;
        this.f47136c = num3;
        this.f47137d = num4;
    }
}
