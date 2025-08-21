package Cv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u00028\u0000\"\n\b\u0000\u0010(*\u0004\u0018\u00010\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"LCv/e;", "", "", "E", "()Z", "", "l", "()Ljava/lang/Void;", "v", "", "G", "()B", "", "r", "()S", "", "x", "()C", "", "k", "()I", "", "n", "()J", "", "s", "()F", "", "t", "()D", "", "B", "()Ljava/lang/String;", "LBv/f;", "descriptor", "y", "(LBv/f;)LCv/e;", "LCv/c;", "b", "(LBv/f;)LCv/c;", "T", "Lzv/a;", "deserializer", "z", "(Lzv/a;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface e {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {
        public static <T> T a(e eVar, InterfaceC18555a<? extends T> deserializer) {
            Intrinsics.j(deserializer, "deserializer");
            return deserializer.c(eVar);
        }
    }

    String B();

    boolean E();

    byte G();

    c b(Bv.f descriptor);

    int k();

    Void l();

    long n();

    short r();

    float s();

    double t();

    boolean v();

    char x();

    e y(Bv.f descriptor);

    <T> T z(InterfaceC18555a<? extends T> deserializer);
}
