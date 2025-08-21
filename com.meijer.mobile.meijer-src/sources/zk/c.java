package zk;

import com.meijer.mobile.core.util.moshi.SkipBadElements;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import com.squareup.moshi.z;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\tB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzk/c;", "Lcom/squareup/moshi/h;", "", "", "elementAdapter", "<init>", "(Lcom/squareup/moshi/h;)V", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Ljava/util/List;", "Lcom/squareup/moshi/q;", "writer", "value", "", "b", "(Lcom/squareup/moshi/q;Ljava/util/List;)V", "Lcom/squareup/moshi/h;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c extends h<List<? extends Object>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h<Object> elementAdapter;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzk/c$a;", "Lcom/squareup/moshi/h$e;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/t;", "moshi", "Lcom/squareup/moshi/h;", "a", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/t;)Lcom/squareup/moshi/h;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements h.e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f172813a = new a();

        @Override // com.squareup.moshi.h.e
        public h<?> a(Type type, Set<? extends Annotation> annotations, t moshi) {
            Set<? extends Annotation> setK;
            Intrinsics.j(type, "type");
            Intrinsics.j(annotations, "annotations");
            Intrinsics.j(moshi, "moshi");
            if (!Intrinsics.e(z.a(type), List.class) || (setK = x.k(annotations, SkipBadElements.class)) == null) {
                return null;
            }
            h hVarI = moshi.i(f172813a, x.c(type, List.class), setK);
            Intrinsics.g(hVarI);
            return new c(hVarI);
        }

        private a() {
        }
    }

    public c(h<Object> elementAdapter) {
        Intrinsics.j(elementAdapter, "elementAdapter");
        this.elementAdapter = elementAdapter;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Object> fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        ArrayList arrayList = new ArrayList();
        reader.a();
        while (reader.hasNext()) {
            try {
                arrayList.add(this.elementAdapter.fromJson(reader.m()));
            } catch (JsonDataException e10) {
                qw.a.INSTANCE.f(e10, "Skipped bad element", new Object[0]);
            }
            reader.skipValue();
        }
        reader.c();
        return arrayList;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, List<? extends Object> value) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.a();
        int size = value.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.elementAdapter.toJson(writer, (q) value.get(i10));
        }
        writer.d();
    }
}
