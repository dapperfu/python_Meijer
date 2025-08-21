package Qj;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0017\u0018\u00002\u00020\u0001B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u000eH\u0004¢\u0006\u0004\b(\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010*R\u001e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00100R\u0016\u0010>\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010AR\u0016\u0010B\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\"\u0010G\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00103\u001a\u0004\b?\u0010D\"\u0004\bE\u0010F¨\u0006H"}, d2 = {"LQj/j;", "LQj/a;", "Landroid/content/Context;", "context", "", "messageResourceId", "", "", "messageFormatArgs", "<init>", "(Landroid/content/Context;I[Ljava/lang/Object;)V", "", "message", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "", "s", "()V", "titleResourceId", "titleFormatArgs", "r", "(I[Ljava/lang/Object;)LQj/j;", "confirmButtonResourceId", "Landroid/content/DialogInterface$OnClickListener;", "confirmListener", "o", "(ILandroid/content/DialogInterface$OnClickListener;)LQj/j;", "p", "(Landroid/content/DialogInterface$OnClickListener;)LQj/j;", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListener", "q", "(Landroid/content/DialogInterface$OnDismissListener;)LQj/j;", "n", "()LQj/j;", "l", "Landroidx/appcompat/app/c$a;", "alertBuilder", "c", "(Landroidx/appcompat/app/c$a;)V", "b", "t", "e", "I", "getMessageResourceId", "()I", "setMessageResourceId", "(I)V", "f", "[Ljava/lang/Object;", "", "g", "Z", "messageFromHtml", "h", "Ljava/lang/CharSequence;", "getMessage", "()Ljava/lang/CharSequence;", "setMessage", "(Ljava/lang/CharSequence;)V", "i", "j", "k", "confirmButtonConfigured", "m", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface$OnDismissListener;", "finishOnConfirm", "confirmFinishResultCode", "()Z", "setCancelable", "(Z)V", "cancelable", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class j extends a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int messageResourceId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Object[] messageFormatArgs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean messageFromHtml;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private CharSequence message;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int titleResourceId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Object[] titleFormatArgs;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean confirmButtonConfigured;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int confirmButtonResourceId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private DialogInterface.OnClickListener confirmListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private DialogInterface.OnDismissListener dismissListener;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean finishOnConfirm;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int confirmFinishResultCode;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean cancelable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i10, Object... messageFormatArgs) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(messageFormatArgs, "messageFormatArgs");
        this.confirmButtonResourceId = R.string.ok;
        this.cancelable = true;
        this.messageResourceId = i10;
        this.messageFormatArgs = messageFormatArgs;
    }

    public j n() {
        this.cancelable = false;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(j jVar, DialogInterface dialogInterface) {
        DialogInterface.OnClickListener onClickListener = jVar.confirmListener;
        Intrinsics.g(onClickListener);
        onClickListener.onClick(dialogInterface, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(j jVar, DialogInterface dialogInterface, int i10) {
        if (jVar.confirmFinishResultCode != 0) {
            ((Activity) jVar.getContext()).setResult(jVar.confirmFinishResultCode);
        }
        ((Activity) jVar.getContext()).finish();
    }

    private final void s() {
        if (this.confirmButtonConfigured) {
            throw new IllegalStateException("Cannot configure confirmButton / confirmListener multiple times; this is a developer error!");
        }
        this.confirmButtonConfigured = true;
    }

    @Override // Qj.a
    protected void b(c.a alertBuilder) {
        Intrinsics.j(alertBuilder, "alertBuilder");
        if (!this.cancelable || this.confirmListener == null) {
            return;
        }
        alertBuilder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: Qj.h
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                j.j(this.f31001a, dialogInterface);
            }
        });
    }

    @Override // Qj.a
    protected void c(c.a alertBuilder) {
        Intrinsics.j(alertBuilder, "alertBuilder");
        if (getCustomView() != null) {
            alertBuilder.setView(getCustomView());
        }
        CharSequence charSequenceA = this.message;
        if (charSequenceA == null) {
            Object[] objArr = this.messageFormatArgs;
            if (objArr == null) {
                Intrinsics.x("messageFormatArgs");
                objArr = null;
            }
            if (objArr.length == 0) {
                charSequenceA = getContext().getString(this.messageResourceId);
            } else {
                Context context = getContext();
                int i10 = this.messageResourceId;
                Object[] objArr2 = this.messageFormatArgs;
                if (objArr2 == null) {
                    Intrinsics.x("messageFormatArgs");
                    objArr2 = null;
                }
                charSequenceA = context.getString(i10, Arrays.copyOf(objArr2, objArr2.length));
            }
        }
        if (this.messageFromHtml && (charSequenceA instanceof String)) {
            charSequenceA = m2.b.a((String) charSequenceA, 0, null, null);
        }
        alertBuilder.setMessage(charSequenceA);
        if (this.titleResourceId != 0) {
            Context context2 = getContext();
            int i11 = this.titleResourceId;
            Object[] objArr3 = this.titleFormatArgs;
            if (objArr3 == null) {
                Intrinsics.x("titleFormatArgs");
                objArr3 = null;
            }
            String string = context2.getString(i11, Arrays.copyOf(objArr3, objArr3.length));
            Intrinsics.i(string, "getString(...)");
            alertBuilder.setTitle(m2.b.a(string, 0, null, null));
        }
        if (this.confirmListener != null && this.finishOnConfirm) {
            throw new IllegalStateException("Cannot register confirmLister and enable finishOnConfirm; call finish() in confirmListener instead");
        }
        if (this.finishOnConfirm && (getContext() instanceof Activity)) {
            this.confirmListener = new DialogInterface.OnClickListener() { // from class: Qj.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    j.k(this.f31002a, dialogInterface, i12);
                }
            };
        }
        alertBuilder.setOnDismissListener(this.dismissListener);
        alertBuilder.setPositiveButton(this.confirmButtonResourceId, this.confirmListener);
        alertBuilder.setCancelable(this.cancelable);
    }

    /* renamed from: m, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final j q(DialogInterface.OnDismissListener dismissListener) {
        this.dismissListener = dismissListener;
        return this;
    }

    public j r(int titleResourceId, Object... titleFormatArgs) {
        Intrinsics.j(titleFormatArgs, "titleFormatArgs");
        this.titleResourceId = titleResourceId;
        this.titleFormatArgs = titleFormatArgs;
        return this;
    }

    public j l() {
        t();
        this.finishOnConfirm = true;
        return this;
    }

    public j o(int confirmButtonResourceId, DialogInterface.OnClickListener confirmListener) {
        s();
        this.confirmButtonResourceId = confirmButtonResourceId;
        this.confirmListener = confirmListener;
        return this;
    }

    public j p(DialogInterface.OnClickListener confirmListener) {
        s();
        this.confirmListener = confirmListener;
        return this;
    }

    protected final void t() {
        if (getContext() instanceof Activity) {
        } else {
            throw new IllegalStateException("Cannot register finishOnConfirm/Cancel method; Context is not an Activity; this is a developer error!");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, CharSequence charSequence) {
        super(context);
        Intrinsics.j(context, "context");
        this.confirmButtonResourceId = R.string.ok;
        this.cancelable = true;
        this.message = charSequence;
    }
}
