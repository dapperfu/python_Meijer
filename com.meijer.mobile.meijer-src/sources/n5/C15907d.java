package n5;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n5.AbstractC15906c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln5/d;", "Ln5/j;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ln5/i;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: n5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15907d implements InterfaceC15913j {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C15907d) && Intrinsics.e(this.context, ((C15907d) other).context);
    }

    @Override // n5.InterfaceC15913j
    public Object b(Continuation<? super Size> continuation) {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        AbstractC15906c.a aVarA = C15904a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new Size(aVarA, aVarA);
    }

    public int hashCode() {
        return this.context.hashCode();
    }

    public C15907d(Context context) {
        this.context = context;
    }
}
