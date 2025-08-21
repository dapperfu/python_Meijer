package g5;

import android.webkit.MimeTypeMap;
import d5.EnumC13623g;
import d5.t;
import g5.i;
import gw.B;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import m5.C15673l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lg5/j;", "Lg5/i;", "Ljava/io/File;", "data", "<init>", "(Ljava/io/File;)V", "Lg5/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File data;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg5/j$a;", "Lg5/i$a;", "Ljava/io/File;", "<init>", "()V", "data", "Lm5/l;", "options", "La5/h;", "imageLoader", "Lg5/i;", "b", "(Ljava/io/File;Lm5/l;La5/h;)Lg5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<File> {
        @Override // g5.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(File data, C15673l options, a5.h imageLoader) {
            return new j(data);
        }
    }

    @Override // g5.i
    public Object a(Continuation<? super h> continuation) {
        return new m(t.h(B.Companion.d(B.INSTANCE, this.data, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.o(this.data)), EnumC13623g.f128047c);
    }

    public j(File file) {
        this.data = file;
    }
}
