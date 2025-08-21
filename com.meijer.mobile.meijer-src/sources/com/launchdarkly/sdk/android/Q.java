package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.EvaluationDetail;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import jh.C15034c;
import lh.AbstractC15499i;
import lh.C15497g;
import lh.C15503m;
import lh.C15504n;

/* loaded from: classes8.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    private final C15034c f91929a;

    /* renamed from: b, reason: collision with root package name */
    private final List<AbstractC15499i> f91930b;

    @FunctionalInterface
    public interface a {
        void a(C15504n c15504n);
    }

    @FunctionalInterface
    public interface b {
        EvaluationDetail<LDValue> a();
    }

    public static /* synthetic */ void b(C15504n c15504n) {
    }

    public static /* synthetic */ void a(Q q10, C15503m c15503m, List list, LDContext lDContext, C15504n c15504n) {
        for (int size = q10.f91930b.size() - 1; size >= 0; size--) {
            AbstractC15499i abstractC15499i = q10.f91930b.get(size);
            try {
                abstractC15499i.b(c15503m, (Map) list.get(size), c15504n);
            } catch (Exception e10) {
                q10.f91929a.h("During identify with context \"{}\". Stage \"afterIdentify\" of hook \"{}\" reported error: {}", lDContext.n(), q10.d(abstractC15499i), e10.toString());
            }
        }
    }

    public void c(AbstractC15499i abstractC15499i) {
        this.f91930b.add(abstractC15499i);
    }

    public a e(final LDContext lDContext, Integer num) {
        if (this.f91930b.isEmpty()) {
            return new a() { // from class: com.launchdarkly.sdk.android.O
                @Override // com.launchdarkly.sdk.android.Q.a
                public final void a(C15504n c15504n) {
                    Q.b(c15504n);
                }
            };
        }
        final ArrayList arrayList = new ArrayList(this.f91930b.size());
        final C15503m c15503m = new C15503m(lDContext, num);
        for (int i10 = 0; i10 < this.f91930b.size(); i10++) {
            AbstractC15499i abstractC15499i = this.f91930b.get(i10);
            try {
                arrayList.add(Collections.unmodifiableMap(abstractC15499i.d(c15503m, Collections.unmodifiableMap(Collections.EMPTY_MAP))));
            } catch (Exception e10) {
                arrayList.add(Collections.unmodifiableMap(Collections.EMPTY_MAP));
                this.f91929a.h("During identify with context \"{}\". Stage \"beforeIdentify\" of hook \"{}\" reported error: {}", lDContext.n(), d(abstractC15499i), e10.toString());
            }
        }
        return new a() { // from class: com.launchdarkly.sdk.android.P
            @Override // com.launchdarkly.sdk.android.Q.a
            public final void a(C15504n c15504n) {
                Q.a(this.f91925a, c15503m, arrayList, lDContext, c15504n);
            }
        };
    }

    public EvaluationDetail<LDValue> f(String str, String str2, LDContext lDContext, LDValue lDValue, b bVar) {
        if (this.f91930b.isEmpty()) {
            return bVar.a();
        }
        ArrayList arrayList = new ArrayList(this.f91930b.size());
        C15497g c15497g = new C15497g(str, str2, lDContext, lDValue);
        for (int i10 = 0; i10 < this.f91930b.size(); i10++) {
            AbstractC15499i abstractC15499i = this.f91930b.get(i10);
            try {
                arrayList.add(Collections.unmodifiableMap(abstractC15499i.c(c15497g, Collections.unmodifiableMap(Collections.EMPTY_MAP))));
            } catch (Exception e10) {
                arrayList.add(Collections.unmodifiableMap(Collections.EMPTY_MAP));
                this.f91929a.h("During evaluation of flag \"{}\". Stage \"beforeEvaluation\" of hook \"{}\" reported error: {}", str2, d(abstractC15499i), e10.toString());
            }
        }
        EvaluationDetail<LDValue> evaluationDetailA = bVar.a();
        for (int size = this.f91930b.size() - 1; size >= 0; size--) {
            AbstractC15499i abstractC15499i2 = this.f91930b.get(size);
            try {
                abstractC15499i2.a(c15497g, (Map) arrayList.get(size), evaluationDetailA);
            } catch (Exception e11) {
                this.f91929a.h("During evaluation of flag \"{}\". Stage \"afterEvaluation\" of hook \"{}\" reported error: {}", str2, d(abstractC15499i2), e11.toString());
            }
        }
        return evaluationDetailA;
    }

    public Q(C15034c c15034c, List<AbstractC15499i> list) {
        ArrayList arrayList = new ArrayList();
        this.f91930b = arrayList;
        this.f91929a = c15034c;
        arrayList.addAll(list);
    }

    private String d(AbstractC15499i abstractC15499i) {
        try {
            abstractC15499i.e();
            throw null;
        } catch (Exception unused) {
            this.f91929a.e("Exception thrown getting metadata for hook. Unable to get hook name.");
            return "unknown hook";
        }
    }
}
