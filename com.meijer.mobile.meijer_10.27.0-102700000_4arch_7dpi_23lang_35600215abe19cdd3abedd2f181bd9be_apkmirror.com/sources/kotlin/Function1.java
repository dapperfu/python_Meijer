package kotlin;

import V0.C5346q0;
import V0.C5349s0;
import W0.AbstractC5391c;
import kotlin.C6333p;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.o0;
import kotlin.q0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\";\u0010\n\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"<\u0010\r\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "LW0/c;", "Lkotlin/ParameterName;", "name", "colorSpace", "Lc0/o0;", "LV0/q0;", "Lc0/p;", "a", "Lkotlin/jvm/functions/Function1;", "ColorToVector", "LV0/q0$a;", "(LV0/q0$a;)Lkotlin/jvm/functions/Function1;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.h, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class Function1 {

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.jvm.functions.Function1<AbstractC5391c, o0<C5346q0, C6333p>> f59585a = a.f59586f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LW0/c;", "colorSpace", "Lc0/o0;", "LV0/q0;", "Lc0/p;", "a", "(LW0/c;)Lc0/o0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b0.h$a */
    static final class a extends Lambda implements kotlin.jvm.functions.Function1<AbstractC5391c, o0<C5346q0, C6333p>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f59586f = new a();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LV0/q0;", "color", "Lc0/p;", "a", "(J)Lc0/p;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: b0.h$a$a, reason: collision with other inner class name */
        static final class C1174a extends Lambda implements kotlin.jvm.functions.Function1<C5346q0, C6333p> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1174a f59587f = new C1174a();

            C1174a() {
                super(1);
            }

            public final C6333p a(long j10) {
                long jO = C5346q0.o(j10, W0.k.f38267a.D());
                return new C6333p(C5346q0.t(jO), C5346q0.x(jO), C5346q0.w(jO), C5346q0.u(jO));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C6333p invoke(C5346q0 c5346q0) {
                return a(c5346q0.getValue());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/p;", "vector", "LV0/q0;", "a", "(Lc0/p;)J"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: b0.h$a$b */
        static final class b extends Lambda implements kotlin.jvm.functions.Function1<C6333p, C5346q0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC5391c f59588f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC5391c abstractC5391c) {
                super(1);
                this.f59588f = abstractC5391c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C5346q0 invoke(C6333p c6333p) {
                return C5346q0.m(a(c6333p));
            }

            public final long a(C6333p c6333p) {
                float v22 = c6333p.getV2();
                float f10 = 0.0f;
                if (v22 < 0.0f) {
                    v22 = 0.0f;
                }
                float f11 = 1.0f;
                if (v22 > 1.0f) {
                    v22 = 1.0f;
                }
                float v32 = c6333p.getV3();
                float f12 = -0.5f;
                if (v32 < -0.5f) {
                    v32 = -0.5f;
                }
                float f13 = 0.5f;
                if (v32 > 0.5f) {
                    v32 = 0.5f;
                }
                float v42 = c6333p.getV4();
                if (v42 >= -0.5f) {
                    f12 = v42;
                }
                if (f12 <= 0.5f) {
                    f13 = f12;
                }
                float v12 = c6333p.getV1();
                if (v12 >= 0.0f) {
                    f10 = v12;
                }
                if (f10 <= 1.0f) {
                    f11 = f10;
                }
                return C5346q0.o(C5349s0.a(v22, v32, f13, f11, W0.k.f38267a.D()), this.f59588f);
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0<C5346q0, C6333p> invoke(AbstractC5391c abstractC5391c) {
            return q0.a(C1174a.f59587f, new b(abstractC5391c));
        }
    }

    public static final kotlin.jvm.functions.Function1<AbstractC5391c, o0<C5346q0, C6333p>> a(C5346q0.Companion companion) {
        return f59585a;
    }
}
