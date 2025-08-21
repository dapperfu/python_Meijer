package kotlin;

import kotlin.InterfaceC13897E;
import kotlin.InterfaceC15850I;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo0/C;", "state", "Lf0/E;", "scrollScope", "Ln0/I;", "a", "(Lo0/C;Lf0/E;)Ln0/I;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16064y {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"o0/y$a", "Ln0/I;", "Lf0/E;", "", "pixels", "e", "(F)F", "", "index", "offset", "", "d", "(II)V", "targetIndex", "targetOffset", "f", "(II)I", "h", "()I", "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "b", "lastVisibleItemIndex", "a", "itemCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o0.y$a */
    public static final class a implements InterfaceC15850I, InterfaceC13897E {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC13897E f153579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153580b;

        @Override // kotlin.InterfaceC15850I
        public void d(int index, int offset) {
            this.f153580b.m0(index, offset / this.f153580b.J(), true);
        }

        a(InterfaceC13897E interfaceC13897E, AbstractC16037C abstractC16037C) {
            this.f153580b = abstractC16037C;
            this.f153579a = interfaceC13897E;
        }

        @Override // kotlin.InterfaceC15850I
        public int a() {
            return this.f153580b.H();
        }

        @Override // kotlin.InterfaceC15850I
        public int b() {
            return ((InterfaceC16045f) CollectionsKt.D0(this.f153580b.C().h())).getIndex();
        }

        @Override // kotlin.InterfaceC13897E
        public float e(float pixels) {
            return this.f153579a.e(pixels);
        }

        @Override // kotlin.InterfaceC15850I
        public int f(int targetIndex, int targetOffset) {
            return (int) (RangesKt.p(C16063x.a(this.f153580b) + MathKt.d((((targetIndex - this.f153580b.v()) * this.f153580b.J()) - (this.f153580b.w() * this.f153580b.J())) + targetOffset), this.f153580b.getMinScrollOffset(), this.f153580b.getMaxScrollOffset()) - C16063x.a(this.f153580b));
        }

        @Override // kotlin.InterfaceC15850I
        public int g() {
            return this.f153580b.getFirstVisiblePageOffset();
        }

        @Override // kotlin.InterfaceC15850I
        public int h() {
            return this.f153580b.getFirstVisiblePage();
        }
    }

    public static final InterfaceC15850I a(AbstractC16037C abstractC16037C, InterfaceC13897E interfaceC13897E) {
        return new a(interfaceC13897E, abstractC16037C);
    }
}
