package yo;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15331h;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lyo/b;", "", "Landroid/content/Context;", "context", "Lyo/k;", "userManager", "Lqv/K;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lyo/k;Lqv/K;)V", "", "c", "()Ljava/lang/String;", "Ljava/io/File;", "f", "()Ljava/io/File;", "", "d", "()Z", "encodedImageString", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lyo/k;", "Lqv/K;", "persistence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yo.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18265b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ljava/io/File;", "<anonymous>", "(Lqv/O;)Ljava/io/File;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.persistence.BarcodeFileManager$getWriteImageFile$2", f = "BarcodeFileManager.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: yo.b$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f170801a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f170803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f170803c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18265b.this.new a(this.f170803c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super File> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f170801a == 0) {
                ResultKt.b(obj);
                File file = new File(C18265b.this.context.getFilesDir(), C18265b.this.c());
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
                try {
                    C15331h c15331hA = C15331h.INSTANCE.a(this.f170803c);
                    if (c15331hA == null) {
                        c15331hA = C15331h.f148095e;
                    }
                    fileOutputStream.write(c15331hA.b0());
                    fileOutputStream.getFD().sync();
                    Unit unit = Unit.f142422a;
                    CloseableKt.a(fileOutputStream, null);
                    return file;
                } finally {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public C18265b(Context context, k userManager, AbstractC16618K ioDispatcher) {
        Intrinsics.j(context, "context");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.context = context;
        this.userManager = userManager;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.userManager.c() + "barcode";
    }

    public final boolean d() {
        File file = new File(this.context.getFilesDir(), c());
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public final Object e(String str, Continuation<? super File> continuation) {
        return C16644i.g(this.ioDispatcher, new a(str, null), continuation);
    }

    public final File f() {
        File file = new File(this.context.getFilesDir(), c());
        if (file.exists()) {
            return file;
        }
        return null;
    }
}
