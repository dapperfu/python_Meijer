package kotlin;

import V0.C5489q0;
import V0.C5492s0;
import W0.AbstractC5526c;
import kotlin.C6459p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.o0;
import kotlin.q0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\";\u0010\n\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"<\u0010\r\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "LW0/c;", "Lkotlin/ParameterName;", "name", "colorSpace", "Lc0/o0;", "LV0/q0;", "Lc0/p;", "a", "Lkotlin/jvm/functions/Function1;", "ColorToVector", "LV0/q0$a;", "(LV0/q0$a;)Lkotlin/jvm/functions/Function1;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.h, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6308h {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<AbstractC5526c, o0<C5489q0, C6459p>> f59792a = a.f59793f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LW0/c;", "colorSpace", "Lc0/o0;", "LV0/q0;", "Lc0/p;", "a", "(LW0/c;)Lc0/o0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b0.h$a */
    static final class a extends Lambda implements Function1<AbstractC5526c, o0<C5489q0, C6459p>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f59793f = new a();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LV0/q0;", "color", "Lc0/p;", "a", "(J)Lc0/p;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: b0.h$a$a, reason: collision with other inner class name */
        static final class C1187a extends Lambda implements Function1<C5489q0, C6459p> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1187a f59794f = new C1187a();

            C1187a() {
                super(1);
            }

            public final C6459p a(long j10) {
                long jO = C5489q0.o(j10, W0.k.f40555a.D());
                return new C6459p(C5489q0.t(jO), C5489q0.x(jO), C5489q0.w(jO), C5489q0.u(jO));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C6459p invoke(C5489q0 c5489q0) {
                return a(c5489q0.getValue());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/p;", "vector", "LV0/q0;", "a", "(Lc0/p;)J"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: b0.h$a$b */
        static final class b extends Lambda implements Function1<C6459p, C5489q0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC5526c f59795f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC5526c abstractC5526c) {
                super(1);
                this.f59795f = abstractC5526c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C5489q0 invoke(C6459p c6459p) {
                return C5489q0.m(a(c6459p));
            }

            public final long a(C6459p c6459p) {
                float v22 = c6459p.getV2();
                float f10 = 0.0f;
                if (v22 < 0.0f) {
                    v22 = 0.0f;
                }
                float f11 = 1.0f;
                if (v22 > 1.0f) {
                    v22 = 1.0f;
                }
                float v32 = c6459p.getV3();
                float f12 = -0.5f;
                if (v32 < -0.5f) {
                    v32 = -0.5f;
                }
                float f13 = 0.5f;
                if (v32 > 0.5f) {
                    v32 = 0.5f;
                }
                float v42 = c6459p.getV4();
                if (v42 >= -0.5f) {
                    f12 = v42;
                }
                if (f12 <= 0.5f) {
                    f13 = f12;
                }
                float v12 = c6459p.getV1();
                if (v12 >= 0.0f) {
                    f10 = v12;
                }
                if (f10 <= 1.0f) {
                    f11 = f10;
                }
                return C5489q0.o(C5492s0.a(v22, v32, f13, f11, W0.k.f40555a.D()), this.f59795f);
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0<C5489q0, C6459p> invoke(AbstractC5526c abstractC5526c) {
            return q0.a(C1187a.f59794f, new b(abstractC5526c));
        }
    }

    public static final Function1<AbstractC5526c, o0<C5489q0, C6459p>> a(C5489q0.Companion companion) {
        return f59792a;
    }
}
