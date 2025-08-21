package La;

import I9.b;
import Ma.PredictRequestContext;
import Ma.c;
import l9.C15476b;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PredictRequestContext f18079a;

    /* renamed from: b, reason: collision with root package name */
    private final Ma.a f18080b;

    /* renamed from: c, reason: collision with root package name */
    private final C15476b f18081c;

    public c a() {
        return new c(this.f18079a, this.f18080b, this.f18081c);
    }

    public a(PredictRequestContext predictRequestContext, Ma.a aVar, C15476b c15476b) {
        b.c(predictRequestContext, "RequestContext must not be null!");
        b.c(aVar, "HeaderFactory must not be null!");
        b.c(c15476b, "PredictServiceProvider must not be null!");
        this.f18079a = predictRequestContext;
        this.f18080b = aVar;
        this.f18081c = c15476b;
    }
}
