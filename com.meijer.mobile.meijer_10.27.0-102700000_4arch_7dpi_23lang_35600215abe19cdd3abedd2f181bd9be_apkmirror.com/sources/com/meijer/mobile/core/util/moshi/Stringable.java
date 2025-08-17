package com.meijer.mobile.core.util.moshi;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/core/util/moshi/Stringable;", "", "<init>", "()V", "a", "b", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@j
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: classes7.dex */
public @interface Stringable {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/core/util/moshi/Stringable$a;", "Lcom/squareup/moshi/h;", "", "elementAdapter", "<init>", "(Lcom/squareup/moshi/h;)V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Ljava/lang/Object;", "Lcom/squareup/moshi/q;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/q;Ljava/lang/Object;)V", "a", "Lcom/squareup/moshi/h;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends h<Object> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h<Object> elementAdapter;

        public a(h<Object> elementAdapter) {
            Intrinsics.j(elementAdapter, "elementAdapter");
            this.elementAdapter = elementAdapter;
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(k reader) {
            Intrinsics.j(reader, "reader");
            return reader.l() != k.c.STRING ? this.elementAdapter.fromJson(reader) : this.elementAdapter.fromJson(reader.nextString());
        }

        @Override // com.squareup.moshi.h
        public void toJson(q writer, Object value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.R(this.elementAdapter.toJson(value));
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/core/util/moshi/Stringable$b;", "Lcom/squareup/moshi/h$e;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/t;", "moshi", "Lcom/squareup/moshi/h;", "a", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/t;)Lcom/squareup/moshi/h;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements h.e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f96156a = new b();

        @Override // com.squareup.moshi.h.e
        public h<?> a(Type type, Set<? extends Annotation> annotations, t moshi) {
            Intrinsics.j(type, "type");
            Intrinsics.j(annotations, "annotations");
            Intrinsics.j(moshi, "moshi");
            Set<? extends Annotation> setK = x.k(annotations, Stringable.class);
            if (setK == null) {
                return null;
            }
            h hVarI = moshi.i(f96156a, type, setK);
            Intrinsics.g(hVarI);
            return new a(hVarI);
        }

        private b() {
        }
    }
}
