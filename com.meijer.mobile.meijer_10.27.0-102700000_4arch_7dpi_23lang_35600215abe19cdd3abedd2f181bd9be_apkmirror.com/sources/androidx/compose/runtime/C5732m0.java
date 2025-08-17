package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0017R.\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/m0;", "", "<init>", "()V", "Landroidx/compose/runtime/e0;", "content", "Landroidx/compose/runtime/n0;", "nestedContent", "", "a", "(Landroidx/compose/runtime/e0;Landroidx/compose/runtime/n0;)V", "b", "key", "d", "(Landroidx/compose/runtime/e0;)Landroidx/compose/runtime/n0;", "", "c", "(Landroidx/compose/runtime/e0;)Z", "Landroidx/compose/runtime/g0;", "reference", "e", "(Landroidx/compose/runtime/g0;)V", "LD0/b;", "LZ/W;", "contentMap", "containerMap", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5732m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, Object> contentMap = D0.b.e(null, 1, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, Object> containerMap = D0.b.e(null, 1, null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/n0;", "it", "", "a", "(Landroidx/compose/runtime/n0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.m0$a */
    static final class a extends Lambda implements Function1<C5734n0, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5720g0 f50292f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5720g0 c5720g0) {
            super(1);
            this.f50292f = c5720g0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C5734n0 c5734n0) {
            return Boolean.valueOf(Intrinsics.e(c5734n0.getContainer(), this.f50292f));
        }
    }

    public final void a(C5715e0<Object> content, C5734n0 nestedContent) {
        D0.b.a(this.contentMap, content, nestedContent);
        D0.b.a(this.containerMap, nestedContent.getContainer(), content);
    }

    public final void b() {
        D0.b.c(this.contentMap);
        D0.b.c(this.containerMap);
    }

    public final boolean c(C5715e0<Object> key) {
        return D0.b.f(this.contentMap, key);
    }

    public final C5734n0 d(C5715e0<Object> key) {
        C5734n0 c5734n0 = (C5734n0) D0.b.m(this.contentMap, key);
        if (D0.b.j(this.contentMap)) {
            D0.b.c(this.containerMap);
        }
        return c5734n0;
    }

    public final void e(C5720g0 reference) {
        Object objE = this.containerMap.e(reference);
        if (objE != null) {
            if (!(objE instanceof Z.T)) {
                Intrinsics.h(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                D0.b.n(this.contentMap, (C5715e0) objE, new a(reference));
                return;
            }
            Z.c0 c0Var = (Z.c0) objE;
            Object[] objArr = c0Var.content;
            int i10 = c0Var._size;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                Intrinsics.h(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                D0.b.n(this.contentMap, (C5715e0) obj, new a(reference));
            }
        }
    }
}
