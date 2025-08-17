package Pj;

import Bj.o;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LPj/f;", "LPj/a;", "Landroid/content/Context;", "context", "", "msgResourceID", "LPj/g;", "listener", "<init>", "(Landroid/content/Context;ILPj/g;)V", "Landroidx/appcompat/app/c$a;", "alertBuilder", "", "c", "(Landroidx/appcompat/app/c$a;)V", "e", "I", "f", "LPj/g;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f extends a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int msgResourceID;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i10, g gVar) {
        super(context);
        Intrinsics.j(context, "context");
        this.msgResourceID = i10;
        this.listener = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(f fVar, DialogInterface dialogInterface, int i10) {
        g gVar = fVar.listener;
        if (gVar != null) {
            gVar.onSignIn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f fVar, DialogInterface dialogInterface, int i10) {
        g gVar = fVar.listener;
        if (gVar != null) {
            gVar.onCreateAccount();
        }
    }

    @Override // Pj.a
    protected void c(c.a alertBuilder) {
        Intrinsics.j(alertBuilder, "alertBuilder");
        alertBuilder.setMessage(this.msgResourceID).setPositiveButton(o.f2971F0, new DialogInterface.OnClickListener() { // from class: Pj.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f.j(this.f28285a, dialogInterface, i10);
            }
        }).setNegativeButton(o.f3045u, new DialogInterface.OnClickListener() { // from class: Pj.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f.k(this.f28286a, dialogInterface, i10);
            }
        });
    }
}
