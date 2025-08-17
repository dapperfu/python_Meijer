package Bl;

import Al.s;
import Bj.o;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.appcompat.app.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LBl/a;", "LPj/a;", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "deeplinkCode", "(Landroid/content/Context;I)V", "Landroid/net/Uri;", "uri", "(Landroid/content/Context;ILandroid/net/Uri;)V", "Landroidx/appcompat/app/c$a;", "alertBuilder", "", "c", "(Landroidx/appcompat/app/c$a;)V", "Landroid/content/DialogInterface;", "dialogInterface", "i", "onClick", "(Landroid/content/DialogInterface;I)V", "e", "I", "f", "Landroid/net/Uri;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a extends Pj.a implements DialogInterface.OnClickListener {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int deeplinkCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i10) {
        this(context);
        Intrinsics.j(context, "context");
        this.deeplinkCode = i10;
    }

    @Override // Pj.a
    protected void c(c.a alertBuilder) {
        Intrinsics.j(alertBuilder, "alertBuilder");
        alertBuilder.setMessage(o.f2991P0).setPositiveButton(o.f3041s, this).setNegativeButton(o.f3039r, (DialogInterface.OnClickListener) null);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        getContext().startActivity(s.f(getContext(), null, null, false, false, this.deeplinkCode, this.uri, false, 158, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i10, Uri uri) {
        this(context, i10);
        Intrinsics.j(context, "context");
        this.uri = uri;
    }
}
