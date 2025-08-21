package androidx.compose.ui.layout;

import androidx.compose.ui.layout.f0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/f0$a;", "", "parentWidth", "LH1/t;", "parentLayoutDirection", "<init>", "(ILH1/t;)V", "b", "I", "e", "()I", "c", "LH1/t;", "d", "()LH1/t;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class o0 extends f0.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parentWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final H1.t parentLayoutDirection;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0.a
    /* renamed from: d, reason: from getter */
    public H1.t getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0.a
    /* renamed from: e, reason: from getter */
    public int getParentWidth() {
        return this.parentWidth;
    }

    public o0(int i10, H1.t tVar) {
        this.parentWidth = i10;
        this.parentLayoutDirection = tVar;
    }
}
