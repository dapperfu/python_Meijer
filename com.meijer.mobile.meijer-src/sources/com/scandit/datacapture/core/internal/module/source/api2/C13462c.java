package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegateSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13462c implements InterfaceC13459a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f125837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13476p f125838b;

    @Override // com.scandit.datacapture.core.internal.module.source.api2.InterfaceC13459a0
    public final void a(long j10) {
        p0 p0Var = this.f125838b.f125913j;
        if (p0Var != null) {
            ((u0) p0Var).f125949a.use(new q0(j10));
        }
        this.f125837a.invoke(Boolean.TRUE);
        this.f125838b.f125922s = true;
    }

    public C13462c(C13476p c13476p, Function1 completion) {
        Intrinsics.j(completion, "completion");
        this.f125838b = c13476p;
        this.f125837a = completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.scandit.datacapture.core.internal.module.source.api2.InterfaceC13459a0
    public final void a(G result) {
        long j10;
        boolean z10;
        NativeFocusStrategy nativeFocusStrategyB;
        Intrinsics.j(result, "captureResult");
        C13476p c13476p = this.f125838b;
        Integer numA = result.a();
        c13476p.f125918o = numA != null ? numA.intValue() : 0;
        h0 h0Var = (h0) this.f125838b.f125911h;
        h0Var.getClass();
        Intrinsics.j(result, "captureResult");
        h0Var.f125860b.set(result);
        C13476p c13476p2 = this.f125838b;
        if (c13476p2.f125922s) {
            m0 m0Var = c13476p2.f125920q;
            m0Var.getClass();
            Intrinsics.j(result, "captureResult");
            f0 f0Var = m0Var.f125887c;
            f0Var.getClass();
            Intrinsics.j(result, "result");
            f0Var.f125850a = result.b();
            boolean z11 = m0Var.f125894j;
            m0Var.f125894j = z11;
            m0Var.f125887c.a(m0Var, z11);
            if (m0Var.f125891g) {
                W w10 = m0Var.f125886b;
                NativeCameraDelegateSettings nativeCameraDelegateSettings = m0Var.f125889e;
                if (nativeCameraDelegateSettings != null) {
                    Intrinsics.j(nativeCameraDelegateSettings, "<this>");
                    NativeJsonValue properties = nativeCameraDelegateSettings.getProperties();
                    String json = properties != null ? properties.getOptionalStringForKeyOrDefault("focusStrategy", null) : null;
                    if (json != null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            Intrinsics.j(json, "json");
                            NativeFocusStrategy nativeFocusStrategyFocusStrategyFromJsonString = NativeEnumDeserializer.focusStrategyFromJsonString(json);
                            Intrinsics.i(nativeFocusStrategyFocusStrategyFromJsonString, "focusStrategyFromJsonString(...)");
                            nativeFocusStrategyB = Result.b(nativeFocusStrategyFocusStrategyFromJsonString);
                        } catch (Throwable th2) {
                            Result.Companion companion2 = Result.INSTANCE;
                            nativeFocusStrategyB = Result.b(ResultKt.a(th2));
                        }
                        nativeFocusStrategy = Result.g(nativeFocusStrategyB) ? null : nativeFocusStrategyB;
                    }
                }
                int i10 = nativeFocusStrategy == null ? -1 : l0.f125877a[nativeFocusStrategy.ordinal()];
                boolean z12 = i10 == 1 || i10 == 2;
                Z z13 = (Z) w10;
                z13.getClass();
                Intrinsics.j(result, "result");
                float fLongValue = (result.e() != null ? r4.longValue() : 0L) * 1.0E-9f;
                Integer numF = result.f();
                float fIntValue = numF != null ? numF.intValue() : 0;
                Float fD = result.d();
                float fFloatValue = fD != null ? fD.floatValue() : 0.0f;
                float fE = ((O) z13.f125825b).e();
                float fN = 1.0f - RangesKt.n((fFloatValue - fE) / (((O) z13.f125825b).f() - fE), 0.0f, 1.0f);
                float f10 = z13.f125828e;
                int i11 = z13.f125826c;
                float f11 = i11 - 1;
                float f12 = (f10 * f11) + fLongValue;
                float f13 = i11;
                float f14 = f12 / f13;
                z13.f125828e = f14;
                float f15 = ((z13.f125829f * f11) + fIntValue) / f13;
                z13.f125829f = f15;
                float f16 = 1.0f / (f14 * f15);
                Duration.Companion companion3 = Duration.INSTANCE;
                long jT = DurationKt.t(((Number) z13.f125827d.invoke()).longValue(), DurationUnit.f148416d);
                if (fN < 0.8f) {
                    if (!z13.f125833j) {
                        z13.f125833j = true;
                        z13.f125834k = jT;
                    }
                } else {
                    z13.f125833j = false;
                }
                if (z12) {
                    W.f125818a.getClass();
                    j10 = V.f125815c;
                } else {
                    W.f125818a.getClass();
                    j10 = V.f125814b;
                }
                int iOrdinal = z13.f125830g.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (f16 > 0.12f) {
                                    z13.f125830g = Y.f125820a;
                                    com.scandit.datacapture.core.internal.module.utils.i.a("CAM2_AT FD:" + fN + ", EST:" + f16 + " DELAY_TO_ON -> OFF");
                                } else {
                                    if (Duration.t(jT, z13.f125832i) > 0) {
                                        z13.f125830g = Y.f125821b;
                                        com.scandit.datacapture.core.internal.module.utils.i.a("CAM2_AT FD:" + fN + ", EST:" + f16 + " DELAY_TO_ON -> ON");
                                        z10 = true;
                                    }
                                    m0Var.a(Boolean.valueOf(z10));
                                }
                            }
                        } else if (f16 < 0.65f) {
                            z13.f125830g = Y.f125821b;
                            com.scandit.datacapture.core.internal.module.utils.i.a("CAM2_AT FD:" + fN + ", EST:" + f16 + " DELAY_TO_OFF -> ON");
                        } else {
                            if (fN < 0.8f) {
                                long jV = Duration.V(jT, z13.f125834k);
                                W.f125818a.getClass();
                                if (Duration.t(jV, V.f125817e) > 0) {
                                    z13.f125831h = Duration.W(jT, j10);
                                }
                            }
                            if (Duration.t(jT, z13.f125831h) > 0) {
                                z13.f125830g = Y.f125820a;
                                com.scandit.datacapture.core.internal.module.utils.i.a("CAM2_AT FD:" + fN + ", EST:" + f16 + " DELAY_TO_OFF -> OFF");
                            }
                        }
                    } else if (f16 > 0.65f) {
                        z13.f125831h = Duration.W(jT, j10);
                        z13.f125830g = Y.f125822c;
                        com.scandit.datacapture.core.internal.module.utils.i.a("CAM2_AT FD:" + fN + ", EST:" + f16 + " ON -> DELAY_TO_OFF");
                    }
                    z10 = true;
                    m0Var.a(Boolean.valueOf(z10));
                } else if (f16 < 0.12f) {
                    W.f125818a.getClass();
                    z13.f125832i = Duration.W(jT, V.f125816d);
                    z13.f125830g = Y.f125823d;
                    com.scandit.datacapture.core.internal.module.utils.i.a("CAM2_AT FD:" + fN + ", EST:" + f16 + " OFF -> DELAY_TO_ON");
                }
                z10 = false;
                m0Var.a(Boolean.valueOf(z10));
            }
            m0 m0Var2 = this.f125838b.f125920q;
            if (m0Var2.f125896l.hashCode() != m0Var2.f125895k) {
                C13476p.b(this.f125838b);
            }
        }
    }
}
