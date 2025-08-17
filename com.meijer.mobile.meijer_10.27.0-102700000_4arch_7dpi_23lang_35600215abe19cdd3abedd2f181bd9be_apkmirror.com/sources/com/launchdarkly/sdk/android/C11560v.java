package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.EvaluationReason;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import kh.AbstractC15154h;
import mh.C15622c;
import mh.InterfaceC15626g;
import mh.InterfaceC15627h;
import oh.C16059a;
import oh.C16062d;
import oh.C16067i;
import oh.C16073o;

/* renamed from: com.launchdarkly.sdk.android.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11560v extends AbstractC15154h implements InterfaceC15626g {

    /* renamed from: com.launchdarkly.sdk.android.v$a */
    private final class a implements InterfaceC15627h {

        /* renamed from: a, reason: collision with root package name */
        private final C16059a f91287a;

        a(C16059a c16059a) {
            this.f91287a = c16059a;
        }

        @Override // mh.InterfaceC15627h
        public void I3(LDContext lDContext, String str, int i10, int i11, LDValue lDValue, EvaluationReason evaluationReason, LDValue lDValue2, boolean z10, Long l10) {
            this.f91287a.j(new C16067i.b(System.currentTimeMillis(), str, lDContext, i10, i11, lDValue, lDValue2, evaluationReason, null, z10, l10, false));
        }

        @Override // mh.InterfaceC15627h
        public void a3(LDContext lDContext) {
            this.f91287a.j(new C16067i.c(System.currentTimeMillis(), lDContext));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            this.f91287a.close();
        }

        @Override // mh.InterfaceC15627h
        public void k1(boolean z10) {
            this.f91287a.k1(z10);
        }

        @Override // mh.InterfaceC15627h
        public void w3(boolean z10) {
            this.f91287a.w3(z10);
        }
    }

    @Override // mh.InterfaceC15623d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC15627h b(C15622c c15622c) {
        return new a(new C16059a(new C16073o(this.f141938a, this.f141939b, null, this.f141940c, C11557s.p(c15622c).q(), new C16062d(i0.e(c15622c), "/mobile/events/bulk", "/mobile/events/diagnostic", 0L, c15622c.a()), 1, c15622c.i().a(), this.f141941d, c15622c.k(), true, this.f141942e), L.b(), 5, c15622c.a()));
    }

    C11560v() {
    }

    @Override // mh.InterfaceC15626g
    public LDValue a(C15622c c15622c) {
        return LDValue.c().f("allAttributesPrivate", this.f141938a).b("diagnosticRecordingIntervalMillis", this.f141940c).b("eventsCapacity", this.f141939b).b("diagnosticRecordingIntervalMillis", this.f141940c).b("eventsFlushIntervalMillis", this.f141941d).a();
    }
}
