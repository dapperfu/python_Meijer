package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7996fN {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC7917eh0 f74091d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC7917eh0 f74092e;

    /* renamed from: a, reason: collision with root package name */
    private final String f74093a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC7889eN f74094b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC7889eN f74095c;

    public C7996fN(String str, EnumC7889eN enumC7889eN, EnumC7889eN enumC7889eN2) {
        this.f74093a = str;
        this.f74094b = enumC7889eN;
        this.f74095c = enumC7889eN2;
    }

    public final EnumC7889eN a() {
        return this.f74094b;
    }

    public final EnumC7889eN b() {
        return this.f74095c;
    }

    public final String c() {
        return this.f74093a;
    }

    static {
        EnumC7889eN enumC7889eN = EnumC7889eN.PUBLIC_API_CALL;
        EnumC7889eN enumC7889eN2 = EnumC7889eN.PUBLIC_API_CALLBACK;
        C7996fN c7996fN = new C7996fN("tqgt", enumC7889eN, enumC7889eN2);
        EnumC7889eN enumC7889eN3 = EnumC7889eN.DYNAMITE_ENTER;
        C7996fN c7996fN2 = new C7996fN("l.dl", enumC7889eN, enumC7889eN3);
        EnumC7889eN enumC7889eN4 = EnumC7889eN.READ_FROM_DISK_START;
        C7996fN c7996fN3 = new C7996fN("l.rccde", enumC7889eN3, enumC7889eN4);
        C7996fN c7996fN4 = new C7996fN("l.rfd", enumC7889eN4, EnumC7889eN.READ_FROM_DISK_END);
        EnumC7889eN enumC7889eN5 = EnumC7889eN.CLIENT_SIGNALS_START;
        C7996fN c7996fN5 = new C7996fN("l.rcc", enumC7889eN3, enumC7889eN5);
        EnumC7889eN enumC7889eN6 = EnumC7889eN.CLIENT_SIGNALS_END;
        C7996fN c7996fN6 = new C7996fN("l.cs", enumC7889eN5, enumC7889eN6);
        EnumC7889eN enumC7889eN7 = EnumC7889eN.SERVICE_CONNECTED;
        C7996fN c7996fN7 = new C7996fN("l.cts", enumC7889eN6, enumC7889eN7);
        EnumC7889eN enumC7889eN8 = EnumC7889eN.GMS_SIGNALS_START;
        EnumC7889eN enumC7889eN9 = EnumC7889eN.GMS_SIGNALS_END;
        C7996fN c7996fN8 = new C7996fN("l.gs", enumC7889eN8, enumC7889eN9);
        EnumC7889eN enumC7889eN10 = EnumC7889eN.GET_SIGNALS_SDKCORE_START;
        C7996fN c7996fN9 = new C7996fN("l.jse", enumC7889eN9, enumC7889eN10);
        EnumC7889eN enumC7889eN11 = EnumC7889eN.GET_SIGNALS_SDKCORE_END;
        C7996fN c7996fN10 = new C7996fN("l.gs-sdkcore", enumC7889eN10, enumC7889eN11);
        C7996fN c7996fN11 = new C7996fN("l.gs-pp", enumC7889eN11, enumC7889eN2);
        EnumC7889eN enumC7889eN12 = EnumC7889eN.RENDERING_START;
        C7996fN c7996fN12 = new C7996fN("l.render", enumC7889eN12, enumC7889eN2);
        EnumC7889eN enumC7889eN13 = EnumC7889eN.RENDERING_WEBVIEW_CREATION_START;
        C7996fN c7996fN13 = new C7996fN("l.render.pre", enumC7889eN12, enumC7889eN13);
        EnumC7889eN enumC7889eN14 = EnumC7889eN.RENDERING_WEBVIEW_CREATION_END;
        C7996fN c7996fN14 = new C7996fN("l.render.wvc", enumC7889eN13, enumC7889eN14);
        EnumC7889eN enumC7889eN15 = EnumC7889eN.RENDERING_AD_COMPONENT_CREATION_END;
        C7996fN c7996fN15 = new C7996fN("l.render.acc", enumC7889eN14, enumC7889eN15);
        EnumC7889eN enumC7889eN16 = EnumC7889eN.RENDERING_CONFIGURE_WEBVIEW_START;
        EnumC7889eN enumC7889eN17 = EnumC7889eN.RENDERING_CONFIGURE_WEBVIEW_END;
        C7996fN c7996fN16 = new C7996fN("l.render.cfg-wv", enumC7889eN16, enumC7889eN17);
        EnumC7889eN enumC7889eN18 = EnumC7889eN.RENDERING_WEBVIEW_LOAD_HTML_START;
        EnumC7889eN enumC7889eN19 = EnumC7889eN.RENDERING_WEBVIEW_LOAD_HTML_END;
        f74091d = AbstractC7917eh0.B(c7996fN, c7996fN2, c7996fN3, c7996fN4, c7996fN5, c7996fN6, c7996fN7, c7996fN8, c7996fN9, c7996fN10, c7996fN11, c7996fN12, c7996fN13, c7996fN14, c7996fN15, c7996fN16, new C7996fN("l.render.wvlh", enumC7889eN18, enumC7889eN19), new C7996fN("l.render.post", enumC7889eN19, enumC7889eN2), new C7996fN("l.sodv", EnumC7889eN.SIGNAL_ON_DISK_VALIDATION_START, EnumC7889eN.SIGNAL_ON_DISK_VALIDATION_END), new C7996fN("l.sodck", EnumC7889eN.SIGNAL_ON_DISK_CACHE_KEY_START, EnumC7889eN.SIGNAL_ON_DISK_CACHE_KEY_END), new C7996fN("l.sodrar", EnumC7889eN.SIGNAL_ON_DISK_READ_AND_REMOVE_START, EnumC7889eN.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new C7996fN("l.soddc", EnumC7889eN.SIGNAL_ON_DISK_DECODE_START, EnumC7889eN.SIGNAL_ON_DISK_DECODE_END));
        C7996fN c7996fN17 = new C7996fN("l.al", enumC7889eN, enumC7889eN2);
        C7996fN c7996fN18 = new C7996fN("l.al2", enumC7889eN3, enumC7889eN2);
        C7996fN c7996fN19 = new C7996fN("l.dl", enumC7889eN, enumC7889eN3);
        C7996fN c7996fN20 = new C7996fN("l.rcc", enumC7889eN3, enumC7889eN5);
        C7996fN c7996fN21 = new C7996fN("l.cs", enumC7889eN5, enumC7889eN6);
        C7996fN c7996fN22 = new C7996fN("l.cts", enumC7889eN6, enumC7889eN7);
        C7996fN c7996fN23 = new C7996fN("l.gs", enumC7889eN8, enumC7889eN9);
        EnumC7889eN enumC7889eN20 = EnumC7889eN.GET_AD_DICTIONARY_SDKCORE_START;
        C7996fN c7996fN24 = new C7996fN("l.jse", enumC7889eN9, enumC7889eN20);
        EnumC7889eN enumC7889eN21 = EnumC7889eN.GET_AD_DICTIONARY_SDKCORE_END;
        C7996fN c7996fN25 = new C7996fN("l.gad-js", enumC7889eN20, enumC7889eN21);
        EnumC7889eN enumC7889eN22 = EnumC7889eN.HTTP_RESPONSE_READY;
        C7996fN c7996fN26 = new C7996fN("l.http", enumC7889eN21, enumC7889eN22);
        EnumC7889eN enumC7889eN23 = EnumC7889eN.NORMALIZATION_AD_RESPONSE_START;
        C7996fN c7996fN27 = new C7996fN("l.jse-nml", enumC7889eN22, enumC7889eN23);
        EnumC7889eN enumC7889eN24 = EnumC7889eN.NORMALIZATION_AD_RESPONSE_END;
        C7996fN c7996fN28 = new C7996fN("l.nml-js", enumC7889eN23, enumC7889eN24);
        EnumC7889eN enumC7889eN25 = EnumC7889eN.BINDER_CALL_START;
        C7996fN c7996fN29 = new C7996fN("l.nml-gmsg", enumC7889eN24, enumC7889eN25);
        EnumC7889eN enumC7889eN26 = EnumC7889eN.SERVER_RESPONSE_PARSE_START;
        f74092e = AbstractC7917eh0.B(c7996fN17, c7996fN18, c7996fN19, c7996fN20, c7996fN21, c7996fN22, c7996fN23, c7996fN24, c7996fN25, c7996fN26, c7996fN27, c7996fN28, c7996fN29, new C7996fN("l.binder", enumC7889eN25, enumC7889eN26), new C7996fN("l.sr", enumC7889eN26, enumC7889eN12), new C7996fN("l.render", enumC7889eN12, enumC7889eN2), new C7996fN("l.t2", EnumC7889eN.RENDERING_ADSTRING_TYPE2_FETCH_START, EnumC7889eN.RENDERING_ADSTRING_TYPE2_FETCH_END), new C7996fN("l.render.wvc", enumC7889eN13, enumC7889eN14), new C7996fN("l.render.acc", enumC7889eN14, enumC7889eN15), new C7996fN("l.render.cfg-wv", enumC7889eN16, enumC7889eN17), new C7996fN("l.render.pre", enumC7889eN12, enumC7889eN13), new C7996fN("l.render.post", enumC7889eN19, enumC7889eN2), new C7996fN("l.render.wvlh", enumC7889eN18, enumC7889eN19));
    }
}
