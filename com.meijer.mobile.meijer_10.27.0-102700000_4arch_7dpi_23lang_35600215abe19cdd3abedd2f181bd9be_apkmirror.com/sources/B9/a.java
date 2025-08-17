package B9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"LB9/a;", "", "<init>", "()V", "LB9/c;", "responseModel", "", "b", "(LB9/c;)V", "", "c", "(LB9/c;)Z", "a", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a {
    public abstract void a(ResponseModel responseModel);

    public abstract boolean c(ResponseModel responseModel);

    public final void b(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        if (c(responseModel)) {
            a(responseModel);
        }
    }
}
