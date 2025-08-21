package com.meijer.mobile.core.util.moshi;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/meijer/mobile/core/util/moshi/SerializedNulls;", "", "<init>", "()V", "a", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@j
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: classes8.dex */
public @interface SerializedNulls {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/core/util/moshi/SerializedNulls$a;", "Lcom/squareup/moshi/h$e;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/t;", "moshi", "Lcom/squareup/moshi/h;", "a", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/t;)Lcom/squareup/moshi/h;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements h.e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f97012a = new a();

        @Override // com.squareup.moshi.h.e
        public h<?> a(Type type, Set<? extends Annotation> annotations, t moshi) {
            h hVarI;
            Intrinsics.j(type, "type");
            Intrinsics.j(annotations, "annotations");
            Intrinsics.j(moshi, "moshi");
            Set<? extends Annotation> setK = x.k(annotations, SerializedNulls.class);
            if (setK == null || (hVarI = moshi.i(f97012a, type, setK)) == null) {
                return null;
            }
            return hVarI.serializeNulls();
        }

        private a() {
        }
    }
}
