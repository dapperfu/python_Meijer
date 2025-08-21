package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/G1;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/u0;", "", "tag", "<init>", "(Ljava/lang/String;)V", "Lr1/u;", "", "T1", "(Lr1/u;)V", "o", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "K2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class G1 extends Modifier.c implements androidx.compose.ui.node.u0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String tag;

    public final void K2(String str) {
        this.tag = str;
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(r1.u uVar) {
        r1.s.y0(uVar, this.tag);
    }

    public G1(String str) {
        this.tag = str;
    }
}
