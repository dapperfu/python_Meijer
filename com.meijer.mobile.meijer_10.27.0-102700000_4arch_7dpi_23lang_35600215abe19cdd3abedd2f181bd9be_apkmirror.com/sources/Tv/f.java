package Tv;

import Rv.k;
import Tv.f;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kw.AbstractC15335l;
import kw.AbstractC15336m;
import kw.B;
import kw.I;
import kw.InterfaceC15329f;
import kw.J;
import kw.o;
import kw.w;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001t\u0018\u0000 w2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004C>@:B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u001aJ\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0000¢\u0006\u0004\b$\u0010\u0013J\u001e\u0010&\u001a\b\u0018\u00010%R\u00020\u00002\u0006\u0010!\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\b\u0018\u00010)R\u00020\u00002\u0006\u0010!\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\u00112\n\u0010,\u001a\u00060)R\u00020\u00002\u0006\u0010-\u001a\u00020\u001cH\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\u001c2\n\u00103\u001a\u000602R\u00020\u0000H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010\u0013J\r\u00108\u001a\u00020\u0011¢\u0006\u0004\b8\u0010\u0013J\r\u00109\u001a\u00020\u0011¢\u0006\u0004\b9\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR*\u0010\f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010A\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010;R\u0014\u0010P\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010;R\u0014\u0010R\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010;R\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010AR\u0018\u0010W\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR>\u0010^\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u000602R\u00020\u00000Xj\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u000602R\u00020\u0000`Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010?R\u0016\u0010a\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010c\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u001bR\u0016\u0010e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\u001bR\"\u0010i\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001b\u001a\u0004\bf\u0010\u001e\"\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010\u001bR\u0016\u0010m\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010\u001bR\u0016\u0010o\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010AR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010u¨\u0006x"}, d2 = {"LTv/f;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "Lkw/l;", "fileSystem", "Lkw/B;", "directory", "", "appVersion", "valueCount", "", "maxSize", "LUv/d;", "taskRunner", "<init>", "(Lkw/l;Lkw/B;IIJLUv/d;)V", "", "c0", "()V", "Lkw/f;", "R", "()Lkw/f;", "", "line", "e0", "(Ljava/lang/String;)V", "Z", "", "O", "()Z", "m", "l0", "key", "n0", "K", "h0", "LTv/f$d;", "A", "(Ljava/lang/String;)LTv/f$d;", "expectedSequenceNumber", "LTv/f$b;", "w", "(Ljava/lang/String;J)LTv/f$b;", "editor", "success", "p", "(LTv/f$b;Z)V", "i0", "(Ljava/lang/String;)Z", "LTv/f$c;", "entry", "j0", "(LTv/f$c;)Z", "flush", "close", "m0", "u", "a", "Lkw/B;", "D", "()Lkw/B;", "b", "I", "c", "J", "()I", "d", "Lkw/l;", "H", "()Lkw/l;", "value", "e", "getMaxSize", "()J", "setMaxSize", "(J)V", "f", "journalFile", "g", "journalFileTmp", "h", "journalFileBackup", "i", "size", "j", "Lkw/f;", "journalWriter", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "k", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "l", "redundantOpCount", "hasJournalErrors", "n", "civilizedFileSystem", "o", "initialized", "B", "setClosed$okhttp", "(Z)V", "closed", "q", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "s", "nextSequenceNumber", "LUv/c;", "t", "LUv/c;", "cleanupQueue", "Tv/f$e", "LTv/f$e;", "cleanupTask", "v", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class f implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B directory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int valueCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15335l fileSystem;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long maxSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final B journalFile;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final B journalFileTmp;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final B journalFileBackup;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15329f journalWriter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<String, c> lruEntries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int redundantOpCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean hasJournalErrors;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean civilizedFileSystem;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentTrimFailed;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentRebuildFailed;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long nextSequenceNumber;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Uv.c cleanupQueue;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final e cleanupTask;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final String f35525w = "journal";

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final String f35526x = "journal.tmp";

    /* renamed from: y, reason: collision with root package name */
    @JvmField
    public static final String f35527y = "journal.bkp";

    /* renamed from: z, reason: collision with root package name */
    @JvmField
    public static final String f35528z = "libcore.io.DiskLruCache";

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final String f35517A = "1";

    /* renamed from: B, reason: collision with root package name */
    @JvmField
    public static final long f35518B = -1;

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final Regex f35519C = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: D, reason: collision with root package name */
    @JvmField
    public static final String f35520D = "CLEAN";

    /* renamed from: E, reason: collision with root package name */
    @JvmField
    public static final String f35521E = "DIRTY";

    /* renamed from: F, reason: collision with root package name */
    @JvmField
    public static final String f35522F = "REMOVE";

    /* renamed from: G, reason: collision with root package name */
    @JvmField
    public static final String f35523G = "READ";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001d"}, d2 = {"LTv/f$b;", "", "LTv/f$c;", "LTv/f;", "entry", "<init>", "(LTv/f;LTv/f$c;)V", "", "d", "()V", "", "index", "Lkw/I;", "g", "(I)Lkw/I;", "c", "b", "a", "LTv/f$c;", "e", "()LTv/f$c;", "", "[Z", "f", "()[Z", "written", "", "Z", "done", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c entry;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean[] written;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f35553d;

        public b(f fVar, c entry) {
            Intrinsics.j(entry, "entry");
            this.f35553d = fVar;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[fVar.getValueCount()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(f fVar, b bVar, IOException it) {
            Intrinsics.j(it, "it");
            synchronized (fVar) {
                bVar.d();
            }
            return Unit.f142422a;
        }

        public final void b() throws IOException {
            f fVar = this.f35553d;
            synchronized (fVar) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                        fVar.p(this, false);
                    }
                    this.done = true;
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() throws IOException {
            f fVar = this.f35553d;
            synchronized (fVar) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                        fVar.p(this, true);
                    }
                    this.done = true;
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void d() throws IOException {
            if (Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                if (this.f35553d.civilizedFileSystem) {
                    this.f35553d.p(this, false);
                } else {
                    this.entry.q(true);
                }
            }
        }

        /* renamed from: e, reason: from getter */
        public final c getEntry() {
            return this.entry;
        }

        /* renamed from: f, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final I g(int index) {
            final f fVar = this.f35553d;
            synchronized (fVar) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                    return w.b();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    Intrinsics.g(zArr);
                    zArr[index] = true;
                }
                try {
                    return new h(fVar.getFileSystem().A(this.entry.c().get(index)), new Function1() { // from class: Tv.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f.b.h(fVar, this, (IOException) obj);
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return w.b();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0018\u00010\u0017R\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b'\u0010)R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R(\u0010<\u001a\b\u0018\u000107R\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00108\u001a\u0004\b \u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b3\u0010?\"\u0004\b@\u0010AR\"\u0010H\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\b=\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"LTv/f$c;", "", "", "key", "<init>", "(LTv/f;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "Lkw/J;", "k", "(I)Lkw/J;", "", "m", "(Ljava/util/List;)V", "Lkw/f;", "writer", "s", "(Lkw/f;)V", "LTv/f$d;", "LTv/f;", "r", "()LTv/f$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "", "Lkw/B;", "c", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "o", "(Z)V", "readable", "f", "i", "q", "zombie", "LTv/f$b;", "LTv/f$b;", "()LTv/f$b;", "l", "(LTv/f$b;)V", "currentEditor", "h", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "J", "()J", "p", "(J)V", "sequenceNumber", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<B> cleanFiles;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<B> dirtyFiles;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean readable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean zombie;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b currentEditor;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int lockingSourceCount;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long sequenceNumber;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f35563j;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Tv/f$c$a", "Lkw/o;", "", "close", "()V", "", "a", "Z", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends o {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private boolean closed;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f35565b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f35566c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J j10, f fVar, c cVar) {
                super(j10);
                this.f35565b = fVar;
                this.f35566c = cVar;
            }

            @Override // kw.o, kw.J, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (!this.closed) {
                    this.closed = true;
                    f fVar = this.f35565b;
                    c cVar = this.f35566c;
                    synchronized (fVar) {
                        try {
                            cVar.n(cVar.getLockingSourceCount() - 1);
                            if (cVar.getLockingSourceCount() == 0 && cVar.getZombie()) {
                                fVar.j0(cVar);
                            }
                            Unit unit = Unit.f142422a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        public c(f fVar, String key) {
            Intrinsics.j(key, "key");
            this.f35563j = fVar;
            this.key = key;
            this.lengths = new long[fVar.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int valueCount = fVar.getValueCount();
            for (int i10 = 0; i10 < valueCount; i10++) {
                sb2.append(i10);
                List<B> list = this.cleanFiles;
                B directory = this.f35563j.getDirectory();
                String string = sb2.toString();
                Intrinsics.i(string, "toString(...)");
                list.add(directory.u(string));
                sb2.append(".tmp");
                List<B> list2 = this.dirtyFiles;
                B directory2 = this.f35563j.getDirectory();
                String string2 = sb2.toString();
                Intrinsics.i(string2, "toString(...)");
                list2.add(directory2.u(string2));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> strings) throws IOException {
            throw new IOException("unexpected journal line: " + strings);
        }

        private final J k(int index) throws IOException {
            J jD = this.f35563j.getFileSystem().D(this.cleanFiles.get(index));
            if (this.f35563j.civilizedFileSystem) {
                return jD;
            }
            this.lockingSourceCount++;
            return new a(jD, this.f35563j, this);
        }

        public final List<B> a() {
            return this.cleanFiles;
        }

        /* renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        public final List<B> c() {
            return this.dirtyFiles;
        }

        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: f, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: h, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void l(b bVar) {
            this.currentEditor = bVar;
        }

        public final void m(List<String> strings) throws IOException {
            Intrinsics.j(strings, "strings");
            if (strings.size() != this.f35563j.getValueCount()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i10) {
            this.lockingSourceCount = i10;
        }

        public final void o(boolean z10) {
            this.readable = z10;
        }

        public final void p(long j10) {
            this.sequenceNumber = j10;
        }

        public final void q(boolean z10) {
            this.zombie = z10;
        }

        public final d r() throws IOException {
            f fVar = this.f35563j;
            if (k.f33047b && !Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.f35563j.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.f35563j.getValueCount();
                for (int i10 = 0; i10 < valueCount; i10++) {
                    arrayList.add(k(i10));
                }
                return new d(this.f35563j, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Rv.h.f((J) it.next());
                }
                try {
                    this.f35563j.j0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(InterfaceC15329f writer) throws IOException {
            Intrinsics.j(writer, "writer");
            for (long j10 : this.lengths) {
                writer.writeByte(32).E1(j10);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0018\u00010\rR\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LTv/f$d;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "Lkw/J;", "sources", "", "lengths", "<init>", "(LTv/f;Ljava/lang/String;JLjava/util/List;[J)V", "LTv/f$b;", "LTv/f;", "a", "()LTv/f$b;", "", "index", "b", "(I)Lkw/J;", "", "close", "()V", "Ljava/lang/String;", "J", "c", "Ljava/util/List;", "d", "[J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class d implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long sequenceNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<J> sources;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f35571e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(f fVar, String key, long j10, List<? extends J> sources, long[] lengths) {
            Intrinsics.j(key, "key");
            Intrinsics.j(sources, "sources");
            Intrinsics.j(lengths, "lengths");
            this.f35571e = fVar;
            this.key = key;
            this.sequenceNumber = j10;
            this.sources = sources;
            this.lengths = lengths;
        }

        public final b a() throws IOException {
            return this.f35571e.w(this.key, this.sequenceNumber);
        }

        public final J b(int index) {
            return this.sources.get(index);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator<J> it = this.sources.iterator();
            while (it.hasNext()) {
                Rv.h.f(it.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Tv/f$e", "LUv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends Uv.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // Uv.a
        public long f() {
            f fVar = f.this;
            synchronized (fVar) {
                if (!fVar.initialized || fVar.getClosed()) {
                    return -1L;
                }
                try {
                    fVar.m0();
                } catch (IOException unused) {
                    fVar.mostRecentTrimFailed = true;
                }
                try {
                    if (fVar.O()) {
                        fVar.h0();
                        fVar.redundantOpCount = 0;
                    }
                } catch (IOException unused2) {
                    fVar.mostRecentRebuildFailed = true;
                    InterfaceC15329f interfaceC15329f = fVar.journalWriter;
                    if (interfaceC15329f != null) {
                        Rv.h.f(interfaceC15329f);
                    }
                    fVar.journalWriter = w.c(w.b());
                }
                return -1L;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Tv/f$f", "Lkw/m;", "Lkw/B;", "file", "", "mustCreate", "Lkw/I;", "B", "(Lkw/B;Z)Lkw/I;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Tv.f$f, reason: collision with other inner class name */
    public static final class C0780f extends AbstractC15336m {
        @Override // kw.AbstractC15336m, kw.AbstractC15335l
        public I B(B file, boolean mustCreate) throws IOException {
            Intrinsics.j(file, "file");
            B bP = file.p();
            if (bP != null) {
                d(bP);
            }
            return super.B(file, mustCreate);
        }

        C0780f(AbstractC15335l abstractC15335l) {
            super(abstractC15335l);
        }
    }

    private final synchronized void m() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized d A(String key) throws IOException {
        Intrinsics.j(key, "key");
        K();
        m();
        n0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return null;
        }
        d dVarR = cVar.r();
        if (dVarR == null) {
            return null;
        }
        this.redundantOpCount++;
        InterfaceC15329f interfaceC15329f = this.journalWriter;
        Intrinsics.g(interfaceC15329f);
        interfaceC15329f.I0(f35523G).writeByte(32).I0(key).writeByte(10);
        if (O()) {
            Uv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return dVarR;
    }

    public final synchronized void K() throws IOException {
        try {
            if (k.f33047b && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.m(this.journalFileBackup)) {
                if (this.fileSystem.m(this.journalFile)) {
                    this.fileSystem.j(this.journalFileBackup);
                } else {
                    this.fileSystem.c(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Rv.h.x(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.m(this.journalFile)) {
                try {
                    c0();
                    Z();
                    this.initialized = true;
                    return;
                } catch (IOException e10) {
                    okhttp3.internal.platform.c.INSTANCE.e().k("DiskLruCache " + this.directory + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        u();
                        this.closed = false;
                    } catch (Throwable th2) {
                        this.closed = false;
                        throw th2;
                    }
                }
            }
            h0();
            this.initialized = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b currentEditor;
        try {
            if (this.initialized && !this.closed) {
                Collection<c> collectionValues = this.lruEntries.values();
                Intrinsics.i(collectionValues, "<get-values>(...)");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    Intrinsics.g(cVar);
                    if (cVar.getCurrentEditor() != null && (currentEditor = cVar.getCurrentEditor()) != null) {
                        currentEditor.d();
                    }
                }
                m0();
                InterfaceC15329f interfaceC15329f = this.journalWriter;
                if (interfaceC15329f != null) {
                    Rv.h.f(interfaceC15329f);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            m();
            m0();
            InterfaceC15329f interfaceC15329f = this.journalWriter;
            Intrinsics.g(interfaceC15329f);
            interfaceC15329f.flush();
        }
    }

    public final synchronized void h0() throws IOException {
        Throwable th2;
        try {
            InterfaceC15329f interfaceC15329f = this.journalWriter;
            if (interfaceC15329f != null) {
                interfaceC15329f.close();
            }
            InterfaceC15329f interfaceC15329fC = w.c(this.fileSystem.B(this.journalFileTmp, false));
            try {
                interfaceC15329fC.I0(f35528z).writeByte(10);
                interfaceC15329fC.I0(f35517A).writeByte(10);
                interfaceC15329fC.E1(this.appVersion).writeByte(10);
                interfaceC15329fC.E1(this.valueCount).writeByte(10);
                interfaceC15329fC.writeByte(10);
                for (c cVar : this.lruEntries.values()) {
                    Intrinsics.i(cVar, "next(...)");
                    c cVar2 = cVar;
                    if (cVar2.getCurrentEditor() != null) {
                        interfaceC15329fC.I0(f35521E).writeByte(32);
                        interfaceC15329fC.I0(cVar2.getKey());
                        interfaceC15329fC.writeByte(10);
                    } else {
                        interfaceC15329fC.I0(f35520D).writeByte(32);
                        interfaceC15329fC.I0(cVar2.getKey());
                        cVar2.s(interfaceC15329fC);
                        interfaceC15329fC.writeByte(10);
                    }
                }
                Unit unit = Unit.f142422a;
                if (interfaceC15329fC != null) {
                    try {
                        interfaceC15329fC.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    th2 = null;
                }
            } catch (Throwable th4) {
                if (interfaceC15329fC != null) {
                    try {
                        interfaceC15329fC.close();
                    } catch (Throwable th5) {
                        ExceptionsKt.a(th4, th5);
                    }
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.fileSystem.m(this.journalFile)) {
                this.fileSystem.c(this.journalFile, this.journalFileBackup);
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
                Rv.h.i(this.fileSystem, this.journalFileBackup);
            } else {
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
            }
            InterfaceC15329f interfaceC15329f2 = this.journalWriter;
            if (interfaceC15329f2 != null) {
                Rv.h.f(interfaceC15329f2);
            }
            this.journalWriter = R();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final synchronized boolean i0(String key) throws IOException {
        Intrinsics.j(key, "key");
        K();
        m();
        n0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zJ0 = j0(cVar);
        if (zJ0 && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zJ0;
    }

    public final synchronized void p(b editor, boolean success) throws IOException {
        Intrinsics.j(editor, "editor");
        c entry = editor.getEntry();
        if (!Intrinsics.e(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (success && !entry.getReadable()) {
            int i10 = this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] written = editor.getWritten();
                Intrinsics.g(written);
                if (!written[i11]) {
                    editor.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.fileSystem.m(entry.c().get(i11))) {
                    editor.b();
                    return;
                }
            }
        }
        int i12 = this.valueCount;
        for (int i13 = 0; i13 < i12; i13++) {
            B b10 = entry.c().get(i13);
            if (!success || entry.getZombie()) {
                Rv.h.i(this.fileSystem, b10);
            } else if (this.fileSystem.m(b10)) {
                B b11 = entry.a().get(i13);
                this.fileSystem.c(b10, b11);
                long j10 = entry.getLengths()[i13];
                Long lC = this.fileSystem.u(b11).getSize();
                long jLongValue = lC != null ? lC.longValue() : 0L;
                entry.getLengths()[i13] = jLongValue;
                this.size = (this.size - j10) + jLongValue;
            }
        }
        entry.l(null);
        if (entry.getZombie()) {
            j0(entry);
            return;
        }
        this.redundantOpCount++;
        InterfaceC15329f interfaceC15329f = this.journalWriter;
        Intrinsics.g(interfaceC15329f);
        if (entry.getReadable() || success) {
            entry.o(true);
            interfaceC15329f.I0(f35520D).writeByte(32);
            interfaceC15329f.I0(entry.getKey());
            entry.s(interfaceC15329f);
            interfaceC15329f.writeByte(10);
            if (success) {
                long j11 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j11;
                entry.p(j11);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            interfaceC15329f.I0(f35522F).writeByte(32);
            interfaceC15329f.I0(entry.getKey());
            interfaceC15329f.writeByte(10);
        }
        interfaceC15329f.flush();
        if (this.size > this.maxSize || O()) {
            Uv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    @JvmOverloads
    public final synchronized b w(String key, long expectedSequenceNumber) throws IOException {
        Intrinsics.j(key, "key");
        K();
        m();
        n0(key);
        c cVar = this.lruEntries.get(key);
        if (expectedSequenceNumber != f35518B && (cVar == null || cVar.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            InterfaceC15329f interfaceC15329f = this.journalWriter;
            Intrinsics.g(interfaceC15329f);
            interfaceC15329f.I0(f35521E).writeByte(32).I0(key).writeByte(10);
            interfaceC15329f.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.lruEntries.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        Uv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public f(AbstractC15335l fileSystem, B directory, int i10, int i11, long j10, Uv.d taskRunner) {
        Intrinsics.j(fileSystem, "fileSystem");
        Intrinsics.j(directory, "directory");
        Intrinsics.j(taskRunner, "taskRunner");
        this.directory = directory;
        this.appVersion = i10;
        this.valueCount = i11;
        this.fileSystem = new C0780f(fileSystem);
        this.maxSize = j10;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.k();
        this.cleanupTask = new e(k.f33048c + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = directory.u(f35525w);
        this.journalFileTmp = directory.u(f35526x);
        this.journalFileBackup = directory.u(f35527y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O() {
        int i10 = this.redundantOpCount;
        return i10 >= 2000 && i10 >= this.lruEntries.size();
    }

    private final InterfaceC15329f R() throws FileNotFoundException {
        return w.c(new h(this.fileSystem.a(this.journalFile), new Function1() { // from class: Tv.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.T(this.f35516a, (IOException) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(f fVar, IOException it) {
        Intrinsics.j(it, "it");
        if (!k.f33047b || Thread.holdsLock(fVar)) {
            fVar.hasJournalErrors = true;
            return Unit.f142422a;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    private final void Z() throws IOException {
        Rv.h.i(this.fileSystem, this.journalFileTmp);
        Iterator<c> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            Intrinsics.i(next, "next(...)");
            c cVar = next;
            int i10 = 0;
            if (cVar.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    this.size += cVar.getLengths()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    Rv.h.i(this.fileSystem, cVar.a().get(i10));
                    Rv.h.i(this.fileSystem, cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c0() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            kw.l r1 = r9.fileSystem
            kw.B r2 = r9.journalFile
            kw.J r1 = r1.D(r2)
            kw.g r1 = kw.w.d(r1)
            java.lang.String r2 = r1.h1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r1.h1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r1.h1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r1.h1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r1.h1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = Tv.f.f35528z     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r2)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L89
            java.lang.String r7 = Tv.f.f35517A     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r3)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L89
            int r7 = r9.appVersion     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r4 = kotlin.jvm.internal.Intrinsics.e(r7, r4)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L89
            int r4 = r9.valueCount     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5b
            boolean r4 = kotlin.jvm.internal.Intrinsics.e(r4, r5)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L89
            int r4 = r6.length()     // Catch: java.lang.Throwable -> L5b
            if (r4 > 0) goto L89
            r0 = 0
        L51:
            java.lang.String r2 = r1.h1()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r9.e0(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb7
        L5d:
            java.util.LinkedHashMap<java.lang.String, Tv.f$c> r2 = r9.lruEntries     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r9.redundantOpCount = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.j2()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r9.h0()     // Catch: java.lang.Throwable -> L5b
            goto L7d
        L70:
            kw.f r0 = r9.journalWriter     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L77
            Rv.h.f(r0)     // Catch: java.lang.Throwable -> L5b
        L77:
            kw.f r0 = r9.R()     // Catch: java.lang.Throwable -> L5b
            r9.journalWriter = r0     // Catch: java.lang.Throwable -> L5b
        L7d:
            kotlin.Unit r0 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L87
            r1.close()     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r0 = move-exception
            goto Lc1
        L87:
            r0 = 0
            goto Lc1
        L89:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r7.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch: java.lang.Throwable -> L5b
            r7.append(r2)     // Catch: java.lang.Throwable -> L5b
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            r7.append(r3)     // Catch: java.lang.Throwable -> L5b
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            r7.append(r5)     // Catch: java.lang.Throwable -> L5b
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            r7.append(r6)     // Catch: java.lang.Throwable -> L5b
            r0 = 93
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            throw r4     // Catch: java.lang.Throwable -> L5b
        Lb7:
            if (r1 == 0) goto Lc1
            r1.close()     // Catch: java.lang.Throwable -> Lbd
            goto Lc1
        Lbd:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r0, r1)
        Lc1:
            if (r0 != 0) goto Lc4
            return
        Lc4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Tv.f.c0():void");
    }

    private final void e0(String line) throws IOException {
        String strSubstring;
        int iO0 = StringsKt.o0(line, ' ', 0, false, 6, null);
        if (iO0 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i10 = iO0 + 1;
        int iO02 = StringsKt.o0(line, ' ', i10, false, 4, null);
        if (iO02 == -1) {
            strSubstring = line.substring(i10);
            Intrinsics.i(strSubstring, "substring(...)");
            String str = f35522F;
            if (iO0 == str.length() && StringsKt.W(line, str, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i10, iO02);
            Intrinsics.i(strSubstring, "substring(...)");
        }
        c cVar = this.lruEntries.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.lruEntries.put(strSubstring, cVar);
        }
        if (iO02 != -1) {
            String str2 = f35520D;
            if (iO0 == str2.length() && StringsKt.W(line, str2, false, 2, null)) {
                String strSubstring2 = line.substring(iO02 + 1);
                Intrinsics.i(strSubstring2, "substring(...)");
                List<String> listZ0 = StringsKt.Z0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listZ0);
                return;
            }
        }
        if (iO02 == -1) {
            String str3 = f35521E;
            if (iO0 == str3.length() && StringsKt.W(line, str3, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iO02 == -1) {
            String str4 = f35523G;
            if (iO0 == str4.length() && StringsKt.W(line, str4, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + line);
    }

    private final boolean l0() throws IOException {
        for (c cVar : this.lruEntries.values()) {
            Intrinsics.i(cVar, "next(...)");
            c cVar2 = cVar;
            if (!cVar2.getZombie()) {
                j0(cVar2);
                return true;
            }
        }
        return false;
    }

    private final void n0(String key) {
        if (f35519C.j(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    public static /* synthetic */ b z(f fVar, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = f35518B;
        }
        return fVar.w(str, j10);
    }

    /* renamed from: B, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: D, reason: from getter */
    public final B getDirectory() {
        return this.directory;
    }

    /* renamed from: H, reason: from getter */
    public final AbstractC15335l getFileSystem() {
        return this.fileSystem;
    }

    /* renamed from: J, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final boolean j0(c entry) throws IOException {
        InterfaceC15329f interfaceC15329f;
        Intrinsics.j(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (interfaceC15329f = this.journalWriter) != null) {
                interfaceC15329f.I0(f35521E);
                interfaceC15329f.writeByte(32);
                interfaceC15329f.I0(entry.getKey());
                interfaceC15329f.writeByte(10);
                interfaceC15329f.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.q(true);
                return true;
            }
        }
        b currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.d();
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            Rv.h.i(this.fileSystem, entry.a().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.redundantOpCount++;
        InterfaceC15329f interfaceC15329f2 = this.journalWriter;
        if (interfaceC15329f2 != null) {
            interfaceC15329f2.I0(f35522F);
            interfaceC15329f2.writeByte(32);
            interfaceC15329f2.I0(entry.getKey());
            interfaceC15329f2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (O()) {
            Uv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void m0() throws IOException {
        while (this.size > this.maxSize) {
            if (!l0()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final void u() throws IOException {
        close();
        Rv.h.h(this.fileSystem, this.directory);
    }
}
