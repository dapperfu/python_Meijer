package Q6;

import S6.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0011\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"LQ6/e;", "LS6/e$k;", "", "", "", "<init>", "()V", "instance", "Ljava/io/OutputStream;", "stream", "", "a", "(Ljava/lang/Object;Ljava/io/OutputStream;)V", "context", "Ljava/lang/reflect/Type;", "manifest", "Ljava/io/InputStream;", "c", "(Ljava/util/Map;Ljava/lang/reflect/Type;Ljava/io/InputStream;)Ljava/lang/Object;", "", "[B", "placeholder", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class e implements e.k<Map<String, Object>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] placeholder;

    @Override // S6.e.k
    public void a(Object instance, OutputStream stream) throws IOException {
        stream.write(this.placeholder);
    }

    @Override // S6.e.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object b(Map<String, Object> context, Type manifest, InputStream stream) {
        throw new UnsupportedOperationException();
    }

    public e() {
        byte[] bytes = "\"[OBJECT]\"".getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "(this as java.lang.String).getBytes(charset)");
        this.placeholder = bytes;
    }
}
