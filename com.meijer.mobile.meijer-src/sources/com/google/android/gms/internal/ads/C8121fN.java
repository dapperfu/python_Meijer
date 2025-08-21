package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8121fN {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC8042eh0 f74931d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC8042eh0 f74932e;

    /* renamed from: a, reason: collision with root package name */
    private final String f74933a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC8014eN f74934b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC8014eN f74935c;

    public C8121fN(String str, EnumC8014eN enumC8014eN, EnumC8014eN enumC8014eN2) {
        this.f74933a = str;
        this.f74934b = enumC8014eN;
        this.f74935c = enumC8014eN2;
    }

    public final EnumC8014eN a() {
        return this.f74934b;
    }

    public final EnumC8014eN b() {
        return this.f74935c;
    }

    public final String c() {
        return this.f74933a;
    }

    static {
        EnumC8014eN enumC8014eN = EnumC8014eN.PUBLIC_API_CALL;
        EnumC8014eN enumC8014eN2 = EnumC8014eN.PUBLIC_API_CALLBACK;
        C8121fN c8121fN = new C8121fN("tqgt", enumC8014eN, enumC8014eN2);
        EnumC8014eN enumC8014eN3 = EnumC8014eN.DYNAMITE_ENTER;
        C8121fN c8121fN2 = new C8121fN("l.dl", enumC8014eN, enumC8014eN3);
        EnumC8014eN enumC8014eN4 = EnumC8014eN.READ_FROM_DISK_START;
        C8121fN c8121fN3 = new C8121fN("l.rccde", enumC8014eN3, enumC8014eN4);
        C8121fN c8121fN4 = new C8121fN("l.rfd", enumC8014eN4, EnumC8014eN.READ_FROM_DISK_END);
        EnumC8014eN enumC8014eN5 = EnumC8014eN.CLIENT_SIGNALS_START;
        C8121fN c8121fN5 = new C8121fN("l.rcc", enumC8014eN3, enumC8014eN5);
        EnumC8014eN enumC8014eN6 = EnumC8014eN.CLIENT_SIGNALS_END;
        C8121fN c8121fN6 = new C8121fN("l.cs", enumC8014eN5, enumC8014eN6);
        EnumC8014eN enumC8014eN7 = EnumC8014eN.SERVICE_CONNECTED;
        C8121fN c8121fN7 = new C8121fN("l.cts", enumC8014eN6, enumC8014eN7);
        EnumC8014eN enumC8014eN8 = EnumC8014eN.GMS_SIGNALS_START;
        EnumC8014eN enumC8014eN9 = EnumC8014eN.GMS_SIGNALS_END;
        C8121fN c8121fN8 = new C8121fN("l.gs", enumC8014eN8, enumC8014eN9);
        EnumC8014eN enumC8014eN10 = EnumC8014eN.GET_SIGNALS_SDKCORE_START;
        C8121fN c8121fN9 = new C8121fN("l.jse", enumC8014eN9, enumC8014eN10);
        EnumC8014eN enumC8014eN11 = EnumC8014eN.GET_SIGNALS_SDKCORE_END;
        C8121fN c8121fN10 = new C8121fN("l.gs-sdkcore", enumC8014eN10, enumC8014eN11);
        C8121fN c8121fN11 = new C8121fN("l.gs-pp", enumC8014eN11, enumC8014eN2);
        EnumC8014eN enumC8014eN12 = EnumC8014eN.RENDERING_START;
        C8121fN c8121fN12 = new C8121fN("l.render", enumC8014eN12, enumC8014eN2);
        EnumC8014eN enumC8014eN13 = EnumC8014eN.RENDERING_WEBVIEW_CREATION_START;
        C8121fN c8121fN13 = new C8121fN("l.render.pre", enumC8014eN12, enumC8014eN13);
        EnumC8014eN enumC8014eN14 = EnumC8014eN.RENDERING_WEBVIEW_CREATION_END;
        C8121fN c8121fN14 = new C8121fN("l.render.wvc", enumC8014eN13, enumC8014eN14);
        EnumC8014eN enumC8014eN15 = EnumC8014eN.RENDERING_AD_COMPONENT_CREATION_END;
        C8121fN c8121fN15 = new C8121fN("l.render.acc", enumC8014eN14, enumC8014eN15);
        EnumC8014eN enumC8014eN16 = EnumC8014eN.RENDERING_CONFIGURE_WEBVIEW_START;
        EnumC8014eN enumC8014eN17 = EnumC8014eN.RENDERING_CONFIGURE_WEBVIEW_END;
        C8121fN c8121fN16 = new C8121fN("l.render.cfg-wv", enumC8014eN16, enumC8014eN17);
        EnumC8014eN enumC8014eN18 = EnumC8014eN.RENDERING_WEBVIEW_LOAD_HTML_START;
        EnumC8014eN enumC8014eN19 = EnumC8014eN.RENDERING_WEBVIEW_LOAD_HTML_END;
        f74931d = AbstractC8042eh0.B(c8121fN, c8121fN2, c8121fN3, c8121fN4, c8121fN5, c8121fN6, c8121fN7, c8121fN8, c8121fN9, c8121fN10, c8121fN11, c8121fN12, c8121fN13, c8121fN14, c8121fN15, c8121fN16, new C8121fN("l.render.wvlh", enumC8014eN18, enumC8014eN19), new C8121fN("l.render.post", enumC8014eN19, enumC8014eN2), new C8121fN("l.sodv", EnumC8014eN.SIGNAL_ON_DISK_VALIDATION_START, EnumC8014eN.SIGNAL_ON_DISK_VALIDATION_END), new C8121fN("l.sodck", EnumC8014eN.SIGNAL_ON_DISK_CACHE_KEY_START, EnumC8014eN.SIGNAL_ON_DISK_CACHE_KEY_END), new C8121fN("l.sodrar", EnumC8014eN.SIGNAL_ON_DISK_READ_AND_REMOVE_START, EnumC8014eN.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new C8121fN("l.soddc", EnumC8014eN.SIGNAL_ON_DISK_DECODE_START, EnumC8014eN.SIGNAL_ON_DISK_DECODE_END));
        C8121fN c8121fN17 = new C8121fN("l.al", enumC8014eN, enumC8014eN2);
        C8121fN c8121fN18 = new C8121fN("l.al2", enumC8014eN3, enumC8014eN2);
        C8121fN c8121fN19 = new C8121fN("l.dl", enumC8014eN, enumC8014eN3);
        C8121fN c8121fN20 = new C8121fN("l.rcc", enumC8014eN3, enumC8014eN5);
        C8121fN c8121fN21 = new C8121fN("l.cs", enumC8014eN5, enumC8014eN6);
        C8121fN c8121fN22 = new C8121fN("l.cts", enumC8014eN6, enumC8014eN7);
        C8121fN c8121fN23 = new C8121fN("l.gs", enumC8014eN8, enumC8014eN9);
        EnumC8014eN enumC8014eN20 = EnumC8014eN.GET_AD_DICTIONARY_SDKCORE_START;
        C8121fN c8121fN24 = new C8121fN("l.jse", enumC8014eN9, enumC8014eN20);
        EnumC8014eN enumC8014eN21 = EnumC8014eN.GET_AD_DICTIONARY_SDKCORE_END;
        C8121fN c8121fN25 = new C8121fN("l.gad-js", enumC8014eN20, enumC8014eN21);
        EnumC8014eN enumC8014eN22 = EnumC8014eN.HTTP_RESPONSE_READY;
        C8121fN c8121fN26 = new C8121fN("l.http", enumC8014eN21, enumC8014eN22);
        EnumC8014eN enumC8014eN23 = EnumC8014eN.NORMALIZATION_AD_RESPONSE_START;
        C8121fN c8121fN27 = new C8121fN("l.jse-nml", enumC8014eN22, enumC8014eN23);
        EnumC8014eN enumC8014eN24 = EnumC8014eN.NORMALIZATION_AD_RESPONSE_END;
        C8121fN c8121fN28 = new C8121fN("l.nml-js", enumC8014eN23, enumC8014eN24);
        EnumC8014eN enumC8014eN25 = EnumC8014eN.BINDER_CALL_START;
        C8121fN c8121fN29 = new C8121fN("l.nml-gmsg", enumC8014eN24, enumC8014eN25);
        EnumC8014eN enumC8014eN26 = EnumC8014eN.SERVER_RESPONSE_PARSE_START;
        f74932e = AbstractC8042eh0.B(c8121fN17, c8121fN18, c8121fN19, c8121fN20, c8121fN21, c8121fN22, c8121fN23, c8121fN24, c8121fN25, c8121fN26, c8121fN27, c8121fN28, c8121fN29, new C8121fN("l.binder", enumC8014eN25, enumC8014eN26), new C8121fN("l.sr", enumC8014eN26, enumC8014eN12), new C8121fN("l.render", enumC8014eN12, enumC8014eN2), new C8121fN("l.t2", EnumC8014eN.RENDERING_ADSTRING_TYPE2_FETCH_START, EnumC8014eN.RENDERING_ADSTRING_TYPE2_FETCH_END), new C8121fN("l.render.wvc", enumC8014eN13, enumC8014eN14), new C8121fN("l.render.acc", enumC8014eN14, enumC8014eN15), new C8121fN("l.render.cfg-wv", enumC8014eN16, enumC8014eN17), new C8121fN("l.render.pre", enumC8014eN12, enumC8014eN13), new C8121fN("l.render.post", enumC8014eN19, enumC8014eN2), new C8121fN("l.render.wvlh", enumC8014eN18, enumC8014eN19));
    }
}
