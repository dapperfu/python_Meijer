package F2;

import B2.C2912i;
import B2.C2917n;
import B2.I;
import B2.InterfaceC2909f;
import B2.InterfaceC2911h;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LF2/e;", "", "<init>", "()V", "LC2/b;", "LF2/f;", "corruptionHandler", "", "LB2/f;", "migrations", "Lmv/O;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LB2/h;", "b", "(LC2/b;Ljava/util/List;Lmv/O;Lkotlin/jvm/functions/Function0;)LB2/h;", "LB2/I;", PlaceTypes.STORAGE, "a", "(LB2/I;LC2/b;Ljava/util/List;Lmv/O;)LB2/h;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8993a = new e();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "c", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function0<File> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<File> f8994f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends File> function0) {
            super(0);
            this.f8994f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.f8994f.invoke();
            if (Intrinsics.e(FilesKt.o(fileInvoke), "preferences_pb")) {
                File absoluteFile = fileInvoke.getAbsoluteFile();
                Intrinsics.i(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    @JvmOverloads
    public final InterfaceC2911h<f> a(I<f> storage, C2.b<f> corruptionHandler, List<? extends InterfaceC2909f<f>> migrations, InterfaceC15783O scope) {
        Intrinsics.j(storage, "storage");
        Intrinsics.j(migrations, "migrations");
        Intrinsics.j(scope, "scope");
        return new d(C2912i.f2264a.b(storage, corruptionHandler, migrations, scope));
    }

    @JvmOverloads
    public final InterfaceC2911h<f> b(C2.b<f> corruptionHandler, List<? extends InterfaceC2909f<f>> migrations, InterfaceC15783O scope, Function0<? extends File> produceFile) {
        Intrinsics.j(migrations, "migrations");
        Intrinsics.j(scope, "scope");
        Intrinsics.j(produceFile, "produceFile");
        return new d(a(new C2917n(h.f8998a, null, new a(produceFile), 2, null), corruptionHandler, migrations, scope));
    }

    private e() {
    }
}
