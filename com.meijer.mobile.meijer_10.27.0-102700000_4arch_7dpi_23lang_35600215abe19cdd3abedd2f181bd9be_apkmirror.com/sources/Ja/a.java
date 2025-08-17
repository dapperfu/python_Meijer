package Ja;

import G9.b;
import Ka.PredictRequestContext;
import Ka.c;
import j9.C14877b;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PredictRequestContext f14742a;

    /* renamed from: b, reason: collision with root package name */
    private final Ka.a f14743b;

    /* renamed from: c, reason: collision with root package name */
    private final C14877b f14744c;

    public c a() {
        return new c(this.f14742a, this.f14743b, this.f14744c);
    }

    public a(PredictRequestContext predictRequestContext, Ka.a aVar, C14877b c14877b) {
        b.c(predictRequestContext, "RequestContext must not be null!");
        b.c(aVar, "HeaderFactory must not be null!");
        b.c(c14877b, "PredictServiceProvider must not be null!");
        this.f14742a = predictRequestContext;
        this.f14743b = aVar;
        this.f14744c = c14877b;
    }
}
