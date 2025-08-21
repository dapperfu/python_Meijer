package kotlin;

import kotlin.AnimationState;
import kotlin.C6451h;
import kotlin.C6456m;
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
public final class C15851J {

    /* renamed from: a, reason: collision with root package name */
    private static final float f151840a = H1.h.p(2500);

    /* renamed from: b, reason: collision with root package name */
    private static final float f151841b = H1.h.p(1500);

    /* renamed from: c, reason: collision with root package name */
    private static final float f151842c = H1.h.p(50);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", l = {177, 264}, m = "animateScrollToItem")
    /* renamed from: n0.J$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f151843a;

        /* renamed from: b, reason: collision with root package name */
        Object f151844b;

        /* renamed from: c, reason: collision with root package name */
        Object f151845c;

        /* renamed from: d, reason: collision with root package name */
        Object f151846d;

        /* renamed from: e, reason: collision with root package name */
        int f151847e;

        /* renamed from: f, reason: collision with root package name */
        int f151848f;

        /* renamed from: g, reason: collision with root package name */
        int f151849g;

        /* renamed from: h, reason: collision with root package name */
        int f151850h;

        /* renamed from: i, reason: collision with root package name */
        float f151851i;

        /* renamed from: j, reason: collision with root package name */
        float f151852j;

        /* renamed from: k, reason: collision with root package name */
        float f151853k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f151854l;

        /* renamed from: m, reason: collision with root package name */
        int f151855m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f151854l = obj;
            this.f151855m |= Integer.MIN_VALUE;
            return C15851J.b(null, 0, 0, 0, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: n0.J$b */
    static final class b extends Lambda implements Function1<C6451h<Float, C6456m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC15850I f151856f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f151857g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f151858h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f151859i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f151860j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f151861k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f151862l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f151863m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f151864n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f151865o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AnimationState<Float, C6456m>> f151866p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC15850I interfaceC15850I, int i10, float f10, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, boolean z10, float f11, Ref.IntRef intRef, int i11, int i12, Ref.ObjectRef<AnimationState<Float, C6456m>> objectRef) {
            super(1);
            this.f151856f = interfaceC15850I;
            this.f151857g = i10;
            this.f151858h = f10;
            this.f151859i = floatRef;
            this.f151860j = booleanRef;
            this.f151861k = z10;
            this.f151862l = f11;
            this.f151863m = intRef;
            this.f151864n = i11;
            this.f151865o = i12;
            this.f151866p = objectRef;
        }

        public final void a(C6451h<Float, C6456m> c6451h) {
            if (!C15851J.d(this.f151856f, this.f151857g)) {
                float fJ = (this.f151858h > 0.0f ? RangesKt.j(c6451h.e().floatValue(), this.f151858h) : RangesKt.e(c6451h.e().floatValue(), this.f151858h)) - this.f151859i.f143739a;
                float fE = this.f151856f.e(fJ);
                if (!C15851J.d(this.f151856f, this.f151857g) && !C15851J.c(this.f151861k, this.f151856f, this.f151857g, this.f151865o)) {
                    if (fJ != fE) {
                        c6451h.a();
                        this.f151860j.f143735a = false;
                        return;
                    }
                    this.f151859i.f143739a += fJ;
                    if (this.f151861k) {
                        if (c6451h.e().floatValue() > this.f151862l) {
                            c6451h.a();
                        }
                    } else if (c6451h.e().floatValue() < (-this.f151862l)) {
                        c6451h.a();
                    }
                    if (this.f151861k) {
                        if (this.f151863m.f143740a >= 2) {
                            int iB = this.f151857g - this.f151856f.b();
                            int i10 = this.f151864n;
                            if (iB > i10) {
                                this.f151856f.d(this.f151857g - i10, 0);
                            }
                        }
                    } else if (this.f151863m.f143740a >= 2) {
                        int iH = this.f151856f.h();
                        int i11 = this.f151857g;
                        int i12 = iH - i11;
                        int i13 = this.f151864n;
                        if (i12 > i13) {
                            this.f151856f.d(i11 + i13, 0);
                        }
                    }
                }
            }
            if (!C15851J.c(this.f151861k, this.f151856f, this.f151857g, this.f151865o)) {
                if (C15851J.d(this.f151856f, this.f151857g)) {
                    throw new C15874g(InterfaceC15850I.c(this.f151856f, this.f151857g, 0, 2, null), this.f151866p.f143742a);
                }
            } else {
                this.f151856f.d(this.f151857g, this.f151865o);
                this.f151860j.f143735a = false;
                c6451h.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6451h<Float, C6456m> c6451h) {
            a(c6451h);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: n0.J$c */
    static final class c extends Lambda implements Function1<C6451h<Float, C6456m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f151867f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f151868g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC15850I f151869h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, Ref.FloatRef floatRef, InterfaceC15850I interfaceC15850I) {
            super(1);
            this.f151867f = f10;
            this.f151868g = floatRef;
            this.f151869h = interfaceC15850I;
        }

        public final void a(C6451h<Float, C6456m> c6451h) {
            float f10 = this.f151867f;
            float fE = 0.0f;
            if (f10 > 0.0f) {
                fE = RangesKt.j(c6451h.e().floatValue(), this.f151867f);
            } else if (f10 < 0.0f) {
                fE = RangesKt.e(c6451h.e().floatValue(), this.f151867f);
            }
            float f11 = fE - this.f151868g.f143739a;
            if (f11 != this.f151869h.e(f11) || fE != c6451h.e().floatValue()) {
                c6451h.a();
            }
            this.f151868g.f143739a += f11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6451h<Float, C6456m> c6451h) {
            a(c6451h);
            return Unit.f143329a;
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
    public static final java.lang.Object b(kotlin.InterfaceC15850I r37, int r38, int r39, int r40, H1.d r41, kotlin.coroutines.Continuation<? super kotlin.Unit> r42) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C15851J.b(n0.I, int, int, int, H1.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(boolean z10, InterfaceC15850I interfaceC15850I, int i10, int i11) {
        if (z10) {
            if (interfaceC15850I.h() > i10) {
                return true;
            }
            return interfaceC15850I.h() == i10 && interfaceC15850I.g() > i11;
        }
        if (interfaceC15850I.h() < i10) {
            return true;
        }
        return interfaceC15850I.h() == i10 && interfaceC15850I.g() < i11;
    }

    public static final boolean d(InterfaceC15850I interfaceC15850I, int i10) {
        int iH = interfaceC15850I.h();
        if (i10 > interfaceC15850I.b() || iH > i10) {
            return false;
        }
        return true;
    }
}
