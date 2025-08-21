package com.adobe.marketing.mobile;

/* loaded from: classes4.dex */
public enum O {
    NONE("N"),
    REACT_NATIVE("R"),
    FLUTTER("F"),
    CORDOVA("C"),
    UNITY("U"),
    XAMARIN("X");


    /* renamed from: a, reason: collision with root package name */
    private final String f62880a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62881a;

        static {
            int[] iArr = new int[O.values().length];
            f62881a = iArr;
            try {
                iArr[O.REACT_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62881a[O.FLUTTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62881a[O.CORDOVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62881a[O.UNITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62881a[O.XAMARIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62881a[O.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public String b() {
        int i10 = a.f62881a[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "None" : "Xamarin" : "Unity" : "Cordova" : "Flutter" : "React Native";
    }

    public String e() {
        return this.f62880a;
    }

    O(String str) {
        this.f62880a = str;
    }
}
