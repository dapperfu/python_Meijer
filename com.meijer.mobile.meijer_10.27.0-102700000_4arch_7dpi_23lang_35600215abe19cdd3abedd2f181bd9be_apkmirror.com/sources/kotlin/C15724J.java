package kotlin;

import kotlin.AnimationState;
import kotlin.C6325h;
import kotlin.C6330m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Ln0/I;", "", "index", "", "d", "(Ln0/I;I)Z", "scrollOffset", "numOfItemsForTeleport", "LH1/d;", "density", "", "b", "(Ln0/I;IIILH1/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LH1/h;", "a", "F", "TargetDistance", "BoundDistance", "c", "MinimumDistance", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15724J {

    /* renamed from: a, reason: collision with root package name */
    private static final float f150805a = H1.h.p(2500);

    /* renamed from: b, reason: collision with root package name */
    private static final float f150806b = H1.h.p(1500);

    /* renamed from: c, reason: collision with root package name */
    private static final float f150807c = H1.h.p(50);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", l = {177, 264}, m = "animateScrollToItem")
    /* renamed from: n0.J$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f150808a;

        /* renamed from: b, reason: collision with root package name */
        Object f150809b;

        /* renamed from: c, reason: collision with root package name */
        Object f150810c;

        /* renamed from: d, reason: collision with root package name */
        Object f150811d;

        /* renamed from: e, reason: collision with root package name */
        int f150812e;

        /* renamed from: f, reason: collision with root package name */
        int f150813f;

        /* renamed from: g, reason: collision with root package name */
        int f150814g;

        /* renamed from: h, reason: collision with root package name */
        int f150815h;

        /* renamed from: i, reason: collision with root package name */
        float f150816i;

        /* renamed from: j, reason: collision with root package name */
        float f150817j;

        /* renamed from: k, reason: collision with root package name */
        float f150818k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f150819l;

        /* renamed from: m, reason: collision with root package name */
        int f150820m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f150819l = obj;
            this.f150820m |= Integer.MIN_VALUE;
            return C15724J.b(null, 0, 0, 0, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: n0.J$b */
    static final class b extends Lambda implements Function1<C6325h<Float, C6330m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC15723I f150821f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f150822g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f150823h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f150824i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f150825j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f150826k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f150827l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f150828m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f150829n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f150830o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AnimationState<Float, C6330m>> f150831p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC15723I interfaceC15723I, int i10, float f10, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, boolean z10, float f11, Ref.IntRef intRef, int i11, int i12, Ref.ObjectRef<AnimationState<Float, C6330m>> objectRef) {
            super(1);
            this.f150821f = interfaceC15723I;
            this.f150822g = i10;
            this.f150823h = f10;
            this.f150824i = floatRef;
            this.f150825j = booleanRef;
            this.f150826k = z10;
            this.f150827l = f11;
            this.f150828m = intRef;
            this.f150829n = i11;
            this.f150830o = i12;
            this.f150831p = objectRef;
        }

        public final void a(C6325h<Float, C6330m> c6325h) {
            if (!C15724J.d(this.f150821f, this.f150822g)) {
                float fJ = (this.f150823h > 0.0f ? RangesKt.j(c6325h.e().floatValue(), this.f150823h) : RangesKt.e(c6325h.e().floatValue(), this.f150823h)) - this.f150824i.f142832a;
                float fE = this.f150821f.e(fJ);
                if (!C15724J.d(this.f150821f, this.f150822g) && !C15724J.c(this.f150826k, this.f150821f, this.f150822g, this.f150830o)) {
                    if (fJ != fE) {
                        c6325h.a();
                        this.f150825j.f142828a = false;
                        return;
                    }
                    this.f150824i.f142832a += fJ;
                    if (this.f150826k) {
                        if (c6325h.e().floatValue() > this.f150827l) {
                            c6325h.a();
                        }
                    } else if (c6325h.e().floatValue() < (-this.f150827l)) {
                        c6325h.a();
                    }
                    if (this.f150826k) {
                        if (this.f150828m.f142833a >= 2) {
                            int iB = this.f150822g - this.f150821f.b();
                            int i10 = this.f150829n;
                            if (iB > i10) {
                                this.f150821f.d(this.f150822g - i10, 0);
                            }
                        }
                    } else if (this.f150828m.f142833a >= 2) {
                        int iH = this.f150821f.h();
                        int i11 = this.f150822g;
                        int i12 = iH - i11;
                        int i13 = this.f150829n;
                        if (i12 > i13) {
                            this.f150821f.d(i11 + i13, 0);
                        }
                    }
                }
            }
            if (!C15724J.c(this.f150826k, this.f150821f, this.f150822g, this.f150830o)) {
                if (C15724J.d(this.f150821f, this.f150822g)) {
                    throw new C15747g(InterfaceC15723I.c(this.f150821f, this.f150822g, 0, 2, null), this.f150831p.f142835a);
                }
            } else {
                this.f150821f.d(this.f150822g, this.f150830o);
                this.f150825j.f142828a = false;
                c6325h.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6325h<Float, C6330m> c6325h) {
            a(c6325h);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: n0.J$c */
    static final class c extends Lambda implements Function1<C6325h<Float, C6330m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f150832f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f150833g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC15723I f150834h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, Ref.FloatRef floatRef, InterfaceC15723I interfaceC15723I) {
            super(1);
            this.f150832f = f10;
            this.f150833g = floatRef;
            this.f150834h = interfaceC15723I;
        }

        public final void a(C6325h<Float, C6330m> c6325h) {
            float f10 = this.f150832f;
            float fE = 0.0f;
            if (f10 > 0.0f) {
                fE = RangesKt.j(c6325h.e().floatValue(), this.f150832f);
            } else if (f10 < 0.0f) {
                fE = RangesKt.e(c6325h.e().floatValue(), this.f150832f);
            }
            float f11 = fE - this.f150833g.f142832a;
            if (f11 != this.f150834h.e(f11) || fE != c6325h.e().floatValue()) {
                c6325h.a();
            }
            this.f150833g.f142832a += f11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6325h<Float, C6330m> c6325h) {
            a(c6325h);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:(1:(2:39|40))|(1:(16:51|53|(1:55)(1:56)|57|(1:59)(1:61)|60|120|62|63|108|64|65|110|66|(8:69|18|118|70|71|104|35|(4:37|39|40|(0)(4:42|116|43|(1:46))))|99)(1:52))(0)|45|53|(0)(0)|57|(0)(0)|60|120|62|63|108|64|65|110|66|(0)|99) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01df, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e0, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[Catch: g -> 0x01ed, TryCatch #0 {g -> 0x01ed, blocks: (B:35:0x00e6, B:37:0x00ea, B:39:0x00f0, B:53:0x0121, B:57:0x015d), top: B:104:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, c0.k] */
    /* JADX WARN: Type inference failed for: r8v16, types: [T, c0.k] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01b6 -> B:18:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kotlin.InterfaceC15723I r37, int r38, int r39, int r40, H1.d r41, kotlin.coroutines.Continuation<? super kotlin.Unit> r42) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C15724J.b(n0.I, int, int, int, H1.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(boolean z10, InterfaceC15723I interfaceC15723I, int i10, int i11) {
        if (z10) {
            if (interfaceC15723I.h() > i10) {
                return true;
            }
            return interfaceC15723I.h() == i10 && interfaceC15723I.g() > i11;
        }
        if (interfaceC15723I.h() < i10) {
            return true;
        }
        return interfaceC15723I.h() == i10 && interfaceC15723I.g() < i11;
    }

    public static final boolean d(InterfaceC15723I interfaceC15723I, int i10) {
        int iH = interfaceC15723I.h();
        if (i10 > interfaceC15723I.b() || iH > i10) {
            return false;
        }
        return true;
    }
}
