package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.EvaluationDetail;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import ih.C14724c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kh.AbstractC15155i;
import kh.C15153g;
import kh.C15159m;
import kh.C15160n;

/* loaded from: classes7.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    private final C14724c f91090a;

    /* renamed from: b, reason: collision with root package name */
    private final List<AbstractC15155i> f91091b;

    @FunctionalInterface
    public interface a {
        void a(C15160n c15160n);
    }

    @FunctionalInterface
    public interface b {
        EvaluationDetail<LDValue> a();
    }

    public static /* synthetic */ void b(C15160n c15160n) {
    }

    public static /* synthetic */ void a(Q q10, C15159m c15159m, List list, LDContext lDContext, C15160n c15160n) {
        for (int size = q10.f91091b.size() - 1; size >= 0; size--) {
            AbstractC15155i abstractC15155i = q10.f91091b.get(size);
            try {
                abstractC15155i.b(c15159m, (Map) list.get(size), c15160n);
            } catch (Exception e10) {
                q10.f91090a.h("During identify with context \"{}\". Stage \"afterIdentify\" of hook \"{}\" reported error: {}", lDContext.n(), q10.d(abstractC15155i), e10.toString());
            }
        }
    }

    public void c(AbstractC15155i abstractC15155i) {
        this.f91091b.add(abstractC15155i);
    }

    public a e(final LDContext lDContext, Integer num) {
        if (this.f91091b.isEmpty()) {
            return new a() { // from class: com.launchdarkly.sdk.android.O
                @Override // com.launchdarkly.sdk.android.Q.a
                public final void a(C15160n c15160n) {
                    Q.b(c15160n);
                }
            };
        }
        final ArrayList arrayList = new ArrayList(this.f91091b.size());
        final C15159m c15159m = new C15159m(lDContext, num);
        for (int i10 = 0; i10 < this.f91091b.size(); i10++) {
            AbstractC15155i abstractC15155i = this.f91091b.get(i10);
            try {
                arrayList.add(Collections.unmodifiableMap(abstractC15155i.d(c15159m, Collections.unmodifiableMap(Collections.EMPTY_MAP))));
            } catch (Exception e10) {
                arrayList.add(Collections.unmodifiableMap(Collections.EMPTY_MAP));
                this.f91090a.h("During identify with context \"{}\". Stage \"beforeIdentify\" of hook \"{}\" reported error: {}", lDContext.n(), d(abstractC15155i), e10.toString());
            }
        }
        return new a() { // from class: com.launchdarkly.sdk.android.P
            @Override // com.launchdarkly.sdk.android.Q.a
            public final void a(C15160n c15160n) {
                Q.a(this.f91086a, c15159m, arrayList, lDContext, c15160n);
            }
        };
    }

    public EvaluationDetail<LDValue> f(String str, String str2, LDContext lDContext, LDValue lDValue, b bVar) {
        if (this.f91091b.isEmpty()) {
            return bVar.a();
        }
        ArrayList arrayList = new ArrayList(this.f91091b.size());
        C15153g c15153g = new C15153g(str, str2, lDContext, lDValue);
        for (int i10 = 0; i10 < this.f91091b.size(); i10++) {
            AbstractC15155i abstractC15155i = this.f91091b.get(i10);
            try {
                arrayList.add(Collections.unmodifiableMap(abstractC15155i.c(c15153g, Collections.unmodifiableMap(Collections.EMPTY_MAP))));
            } catch (Exception e10) {
                arrayList.add(Collections.unmodifiableMap(Collections.EMPTY_MAP));
                this.f91090a.h("During evaluation of flag \"{}\". Stage \"beforeEvaluation\" of hook \"{}\" reported error: {}", str2, d(abstractC15155i), e10.toString());
            }
        }
        EvaluationDetail<LDValue> evaluationDetailA = bVar.a();
        for (int size = this.f91091b.size() - 1; size >= 0; size--) {
            AbstractC15155i abstractC15155i2 = this.f91091b.get(size);
            try {
                abstractC15155i2.a(c15153g, (Map) arrayList.get(size), evaluationDetailA);
            } catch (Exception e11) {
                this.f91090a.h("During evaluation of flag \"{}\". Stage \"afterEvaluation\" of hook \"{}\" reported error: {}", str2, d(abstractC15155i2), e11.toString());
            }
        }
        return evaluationDetailA;
    }

    public Q(C14724c c14724c, List<AbstractC15155i> list) {
        ArrayList arrayList = new ArrayList();
        this.f91091b = arrayList;
        this.f91090a = c14724c;
        arrayList.addAll(list);
    }

    private String d(AbstractC15155i abstractC15155i) {
        try {
            abstractC15155i.e();
            throw null;
        } catch (Exception unused) {
            this.f91090a.e("Exception thrown getting metadata for hook. Unable to get hook name.");
            return "unknown hook";
        }
    }
}
