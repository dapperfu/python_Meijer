package f5;

import android.webkit.MimeTypeMap;
import c5.EnumC6361g;
import c5.t;
import f5.i;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import kw.B;
import l5.C15376l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lf5/j;", "Lf5/i;", "Ljava/io/File;", "data", "<init>", "(Ljava/io/File;)V", "Lf5/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File data;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf5/j$a;", "Lf5/i$a;", "Ljava/io/File;", "<init>", "()V", "data", "Ll5/l;", "options", "LZ4/h;", "imageLoader", "Lf5/i;", "b", "(Ljava/io/File;Ll5/l;LZ4/h;)Lf5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<File> {
        @Override // f5.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(File data, C15376l options, Z4.h imageLoader) {
            return new j(data);
        }
    }

    @Override // f5.i
    public Object a(Continuation<? super h> continuation) {
        return new m(t.h(B.Companion.d(B.INSTANCE, this.data, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.o(this.data)), EnumC6361g.f61480c);
    }

    public j(File file) {
        this.data = file;
    }
}
