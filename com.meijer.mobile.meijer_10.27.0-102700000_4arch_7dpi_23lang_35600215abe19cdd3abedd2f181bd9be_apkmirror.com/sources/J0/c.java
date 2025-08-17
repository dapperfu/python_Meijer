package J0;

import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.ComposableLambdaN;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LJ0/c;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "", "key", "", "tracked", "arity", "<init>", "(IZI)V", "", "a", "()V", "", "block", "b", "(Ljava/lang/Object;)V", "I", "getKey", "()I", "Z", "c", "getArity", "d", "Ljava/lang/Object;", "_block", "Landroidx/compose/runtime/H0;", "e", "Landroidx/compose/runtime/H0;", "scope", "", "f", "Ljava/util/List;", "scopes", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c implements ComposableLambdaN {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean tracked;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int arity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object _block;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private H0 scope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<H0> scopes;

    private final void a() {
        if (this.tracked) {
            H0 h02 = this.scope;
            if (h02 != null) {
                h02.invalidate();
                this.scope = null;
            }
            List<H0> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    public final void b(Object block) {
        if (Intrinsics.e(block, this._block)) {
            return;
        }
        boolean z10 = this._block == null;
        Intrinsics.h(block, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (FunctionN) block;
        if (z10) {
            return;
        }
        a();
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public c(int i10, boolean z10, int i11) {
        this.key = i10;
        this.tracked = z10;
        this.arity = i11;
    }
}
