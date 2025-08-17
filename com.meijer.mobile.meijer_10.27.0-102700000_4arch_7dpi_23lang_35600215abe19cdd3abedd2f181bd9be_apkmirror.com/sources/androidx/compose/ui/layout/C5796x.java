package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/x;", "Landroidx/compose/ui/node/n0;", "Landroidx/compose/ui/layout/y;", "Landroidx/compose/ui/Modifier$c;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "LH1/d;", "parentData", "R", "(LH1/d;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "o", "Ljava/lang/Object;", "d1", "()Ljava/lang/Object;", "K2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5796x extends Modifier.c implements androidx.compose.ui.node.n0, InterfaceC5797y {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Object layoutId;

    @Override // androidx.compose.ui.node.n0
    public Object R(H1.d dVar, Object obj) {
        return this;
    }

    public void K2(Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.layout.InterfaceC5797y
    /* renamed from: d1, reason: from getter */
    public Object getLayoutId() {
        return this.layoutId;
    }

    public C5796x(Object obj) {
        this.layoutId = obj;
    }
}
