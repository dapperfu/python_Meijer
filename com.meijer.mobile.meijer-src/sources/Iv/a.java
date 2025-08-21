package Iv;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"LIv/a;", "", "<init>", "()V", "", "Lzv/b;", "typeArgumentsSerializers", "a", "(Ljava/util/List;)Lzv/b;", "b", "LIv/a$a;", "LIv/a$b;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001J&\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LIv/a$a;", "LIv/a;", "", "Lzv/b;", "typeArgumentsSerializers", "a", "(Ljava/util/List;)Lzv/b;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lzv/b;", "b", "()Lzv/b;", "serializer", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Iv.a$a, reason: collision with other inner class name */
    public static final class C0248a extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final zv.b<?> serializer;

        @Override // Iv.a
        public zv.b<?> a(List<? extends zv.b<?>> typeArgumentsSerializers) {
            Intrinsics.j(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.serializer;
        }

        public final zv.b<?> b() {
            return this.serializer;
        }

        public boolean equals(Object other) {
            return (other instanceof C0248a) && Intrinsics.e(((C0248a) other).serializer, this.serializer);
        }

        public int hashCode() {
            return this.serializer.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J&\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R@\u0010\r\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LIv/a$b;", "LIv/a;", "", "Lzv/b;", "typeArgumentsSerializers", "a", "(Ljava/util/List;)Lzv/b;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "provider", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<List<? extends zv.b<?>>, zv.b<?>> provider;

        @Override // Iv.a
        public zv.b<?> a(List<? extends zv.b<?>> typeArgumentsSerializers) {
            Intrinsics.j(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.provider.invoke(typeArgumentsSerializers);
        }

        public final Function1<List<? extends zv.b<?>>, zv.b<?>> b() {
            return this.provider;
        }
    }

    public abstract zv.b<?> a(List<? extends zv.b<?>> typeArgumentsSerializers);

    private a() {
    }
}
