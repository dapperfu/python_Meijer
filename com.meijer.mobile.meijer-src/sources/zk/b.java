package zk;

import com.squareup.moshi.h;
import com.squareup.moshi.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzk/b;", "Lcom/squareup/moshi/h$e;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/t;", "moshi", "Lcom/squareup/moshi/h;", "a", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/t;)Lcom/squareup/moshi/h;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b implements h.e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f172811a = new b();

    @Override // com.squareup.moshi.h.e
    public h<?> a(Type type, Set<? extends Annotation> annotations, t moshi) {
        Intrinsics.j(type, "type");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(moshi, "moshi");
        if (annotations.isEmpty() && (type instanceof Class)) {
            Class cls = (Class) type;
            if (cls.isEnum()) {
                return new JsonAdapter(cls).nullSafe();
            }
        }
        return null;
    }

    private b() {
    }
}
