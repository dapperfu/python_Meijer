package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.EvaluationReason;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import lh.AbstractC15498h;
import nh.C15945c;
import nh.InterfaceC15949g;
import nh.InterfaceC15950h;
import ph.C16424a;
import ph.C16427d;
import ph.C16432i;
import ph.C16438o;

/* renamed from: com.launchdarkly.sdk.android.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11685v extends AbstractC15498h implements InterfaceC15949g {

    /* renamed from: com.launchdarkly.sdk.android.v$a */
    private final class a implements InterfaceC15950h {

        /* renamed from: a, reason: collision with root package name */
        private final C16424a f92126a;

        a(C16424a c16424a) {
            this.f92126a = c16424a;
        }

        @Override // nh.InterfaceC15950h
        public void H3(LDContext lDContext, String str, int i10, int i11, LDValue lDValue, EvaluationReason evaluationReason, LDValue lDValue2, boolean z10, Long l10) {
            this.f92126a.j(new C16432i.b(System.currentTimeMillis(), str, lDContext, i10, i11, lDValue, lDValue2, evaluationReason, null, z10, l10, false));
        }

        @Override // nh.InterfaceC15950h
        public void Y2(LDContext lDContext) {
            this.f92126a.j(new C16432i.c(System.currentTimeMillis(), lDContext));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            this.f92126a.close();
        }

        @Override // nh.InterfaceC15950h
        public void l1(boolean z10) {
            this.f92126a.l1(z10);
        }

        @Override // nh.InterfaceC15950h
        public void w3(boolean z10) {
            this.f92126a.w3(z10);
        }
    }

    @Override // nh.InterfaceC15946d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC15950h a(C15945c c15945c) {
        return new a(new C16424a(new C16438o(this.f149621a, this.f149622b, null, this.f149623c, C11682s.p(c15945c).q(), new C16427d(i0.e(c15945c), "/mobile/events/bulk", "/mobile/events/diagnostic", 0L, c15945c.a()), 1, c15945c.i().a(), this.f149624d, c15945c.k(), true, this.f149625e), L.b(), 5, c15945c.a()));
    }

    C11685v() {
    }

    @Override // nh.InterfaceC15949g
    public LDValue b(C15945c c15945c) {
        return LDValue.c().f("allAttributesPrivate", this.f149621a).b("diagnosticRecordingIntervalMillis", this.f149623c).b("eventsCapacity", this.f149622b).b("diagnosticRecordingIntervalMillis", this.f149623c).b("eventsFlushIntervalMillis", this.f149624d).a();
    }
}
