package kotlin.io.path;

import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "j$/nio/file/Path", "", "h", "()Ljava/util/Iterator;", "g", "iterator", "a", "Lj$/nio/file/Path;", "start", "", "Lkotlin/io/path/PathWalkOption;", "b", "[Lkotlin/io/path/PathWalkOption;", "options", "", "i", "()Z", "followLinks", "j$/nio/file/LinkOption", "k", "()[Lj$/nio/file/LinkOption;", "linkOptions", "j", "includeDirectories", "l", "isBFS", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PathTreeWalk implements Sequence<Path> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Path start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PathWalkOption[] options;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/SequenceScope;", "j$/nio/file/Path", "", "<anonymous>", "(Lkotlin/sequences/SequenceScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", l = {191, 197}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f143679b;

        /* renamed from: c, reason: collision with root package name */
        Object f143680c;

        /* renamed from: d, reason: collision with root package name */
        Object f143681d;

        /* renamed from: e, reason: collision with root package name */
        Object f143682e;

        /* renamed from: f, reason: collision with root package name */
        Object f143683f;

        /* renamed from: g, reason: collision with root package name */
        int f143684g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f143685h;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = PathTreeWalk.this.new a(continuation);
            aVar.f143685h = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f6 -> B:11:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f8 -> B:11:0x007d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws kotlin.io.path.IllegalFileNameException, java.nio.file.FileSystemLoopException {
            /*
                Method dump skipped, instructions count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/SequenceScope;", "j$/nio/file/Path", "", "<anonymous>", "(Lkotlin/sequences/SequenceScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", l = {191, 197, 210, 216}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f143687b;

        /* renamed from: c, reason: collision with root package name */
        Object f143688c;

        /* renamed from: d, reason: collision with root package name */
        Object f143689d;

        /* renamed from: e, reason: collision with root package name */
        Object f143690e;

        /* renamed from: f, reason: collision with root package name */
        Object f143691f;

        /* renamed from: g, reason: collision with root package name */
        int f143692g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f143693h;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = PathTreeWalk.this.new b(continuation);
            bVar.f143693h = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
            return ((b) create(sequenceScope, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0143, code lost:
        
            if (r7.c(r10, r13) == r0) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01d5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01d3 -> B:39:0x0147). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01d5 -> B:39:0x0147). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws kotlin.io.path.IllegalFileNameException, java.nio.file.FileSystemLoopException {
            /*
                Method dump skipped, instructions count: 542
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final Iterator<Path> g() {
        return SequencesKt.a(new a(null));
    }

    private final Iterator<Path> h() {
        return SequencesKt.a(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        return ArraysKt.Y(this.options, PathWalkOption.f143697c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return ArraysKt.Y(this.options, PathWalkOption.f143695a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] k() {
        return LinkFollowing.f143668a.a(i());
    }

    private final boolean l() {
        return ArraysKt.Y(this.options, PathWalkOption.f143696b);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<Path> iterator() {
        if (l()) {
            return g();
        }
        return h();
    }
}
