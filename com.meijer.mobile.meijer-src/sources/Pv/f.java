package Pv;

import Nv.k;
import Pv.f;
import gw.AbstractC14423l;
import gw.AbstractC14424m;
import gw.AbstractC14426o;
import gw.B;
import gw.InterfaceC14417f;
import gw.J;
import gw.K;
import gw.w;
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

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001u\u0018\u0000 x2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004C>@:B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u001aJ\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0000¢\u0006\u0004\b$\u0010\u0013J\u001e\u0010&\u001a\b\u0018\u00010%R\u00020\u00002\u0006\u0010!\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\b\u0018\u00010)R\u00020\u00002\u0006\u0010!\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\u00112\n\u0010,\u001a\u00060)R\u00020\u00002\u0006\u0010-\u001a\u00020\u001cH\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\u001c2\n\u00103\u001a\u000602R\u00020\u0000H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010\u0013J\r\u00108\u001a\u00020\u0011¢\u0006\u0004\b8\u0010\u0013J\r\u00109\u001a\u00020\u0011¢\u0006\u0004\b9\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR*\u0010\f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010A\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010;R\u0014\u0010P\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010;R\u0014\u0010R\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010;R\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010AR\u0018\u0010W\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR>\u0010^\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u000602R\u00020\u00000Xj\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u000602R\u00020\u0000`Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010?R\u0016\u0010b\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010aR\u0016\u0010d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0016\u0010f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010aR\"\u0010j\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010a\u001a\u0004\bg\u0010\u001e\"\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010aR\u0016\u0010n\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010aR\u0016\u0010p\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010AR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010w\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010v¨\u0006y"}, d2 = {"LPv/f;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "Lgw/l;", "fileSystem", "Lgw/B;", "directory", "", "appVersion", "valueCount", "", "maxSize", "LQv/d;", "taskRunner", "<init>", "(Lgw/l;Lgw/B;IIJLQv/d;)V", "", "b0", "()V", "Lgw/f;", "R", "()Lgw/f;", "", "line", "e0", "(Ljava/lang/String;)V", "Y", "", "O", "()Z", "m", "m0", "key", "o0", "K", "h0", "LPv/f$d;", "A", "(Ljava/lang/String;)LPv/f$d;", "expectedSequenceNumber", "LPv/f$b;", "w", "(Ljava/lang/String;J)LPv/f$b;", "editor", "success", "p", "(LPv/f$b;Z)V", "j0", "(Ljava/lang/String;)Z", "LPv/f$c;", "entry", "k0", "(LPv/f$c;)Z", "flush", "close", "n0", "u", "a", "Lgw/B;", "D", "()Lgw/B;", "b", "I", "c", "J", "()I", "d", "Lgw/l;", "H", "()Lgw/l;", "value", "e", "getMaxSize", "()J", "setMaxSize", "(J)V", "f", "journalFile", "g", "journalFileTmp", "h", "journalFileBackup", "i", "size", "j", "Lgw/f;", "journalWriter", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "k", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "l", "redundantOpCount", "Z", "hasJournalErrors", "n", "civilizedFileSystem", "o", "initialized", "B", "setClosed$okhttp", "(Z)V", "closed", "q", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "s", "nextSequenceNumber", "LQv/c;", "t", "LQv/c;", "cleanupQueue", "Pv/f$e", "LPv/f$e;", "cleanupTask", "v", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class f implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B directory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int valueCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14423l fileSystem;

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
    private InterfaceC14417f journalWriter;

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
    private final Qv.c cleanupQueue;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final e cleanupTask;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final String f27297w = "journal";

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final String f27298x = "journal.tmp";

    /* renamed from: y, reason: collision with root package name */
    @JvmField
    public static final String f27299y = "journal.bkp";

    /* renamed from: z, reason: collision with root package name */
    @JvmField
    public static final String f27300z = "libcore.io.DiskLruCache";

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final String f27289A = "1";

    /* renamed from: B, reason: collision with root package name */
    @JvmField
    public static final long f27290B = -1;

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final Regex f27291C = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: D, reason: collision with root package name */
    @JvmField
    public static final String f27292D = "CLEAN";

    /* renamed from: E, reason: collision with root package name */
    @JvmField
    public static final String f27293E = "DIRTY";

    /* renamed from: F, reason: collision with root package name */
    @JvmField
    public static final String f27294F = "REMOVE";

    /* renamed from: G, reason: collision with root package name */
    @JvmField
    public static final String f27295G = "READ";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001d"}, d2 = {"LPv/f$b;", "", "LPv/f$c;", "LPv/f;", "entry", "<init>", "(LPv/f;LPv/f$c;)V", "", "d", "()V", "", "index", "Lgw/J;", "g", "(I)Lgw/J;", "c", "b", "a", "LPv/f$c;", "e", "()LPv/f$c;", "", "[Z", "f", "()[Z", "written", "", "Z", "done", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c entry;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean[] written;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f27325d;

        public b(f fVar, c entry) {
            Intrinsics.j(entry, "entry");
            this.f27325d = fVar;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[fVar.getValueCount()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(f fVar, b bVar, IOException it) {
            Intrinsics.j(it, "it");
            synchronized (fVar) {
                bVar.d();
            }
            return Unit.f143329a;
        }

        public final void b() throws IOException {
            f fVar = this.f27325d;
            synchronized (fVar) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                        fVar.p(this, false);
                    }
                    this.done = true;
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() throws IOException {
            f fVar = this.f27325d;
            synchronized (fVar) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                        fVar.p(this, true);
                    }
                    this.done = true;
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void d() throws IOException {
            if (Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                if (this.f27325d.civilizedFileSystem) {
                    this.f27325d.p(this, false);
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

        public final J g(int index) {
            final f fVar = this.f27325d;
            synchronized (fVar) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                    return w.a();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    Intrinsics.g(zArr);
                    zArr[index] = true;
                }
                try {
                    return new h(fVar.getFileSystem().A(this.entry.c().get(index)), new Function1() { // from class: Pv.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f.b.h(fVar, this, (IOException) obj);
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return w.a();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0018\u00010\u0017R\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b'\u0010)R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R(\u0010<\u001a\b\u0018\u000107R\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00108\u001a\u0004\b \u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b3\u0010?\"\u0004\b@\u0010AR\"\u0010H\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\b=\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"LPv/f$c;", "", "", "key", "<init>", "(LPv/f;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "Lgw/K;", "k", "(I)Lgw/K;", "", "m", "(Ljava/util/List;)V", "Lgw/f;", "writer", "s", "(Lgw/f;)V", "LPv/f$d;", "LPv/f;", "r", "()LPv/f$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "", "Lgw/B;", "c", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "o", "(Z)V", "readable", "f", "i", "q", "zombie", "LPv/f$b;", "LPv/f$b;", "()LPv/f$b;", "l", "(LPv/f$b;)V", "currentEditor", "h", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "J", "()J", "p", "(J)V", "sequenceNumber", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        final /* synthetic */ f f27335j;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Pv/f$c$a", "Lgw/o;", "", "close", "()V", "", "a", "Z", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends AbstractC14426o {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private boolean closed;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f27337b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f27338c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10, f fVar, c cVar) {
                super(k10);
                this.f27337b = fVar;
                this.f27338c = cVar;
            }

            @Override // gw.AbstractC14426o, gw.K, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (!this.closed) {
                    this.closed = true;
                    f fVar = this.f27337b;
                    c cVar = this.f27338c;
                    synchronized (fVar) {
                        try {
                            cVar.n(cVar.getLockingSourceCount() - 1);
                            if (cVar.getLockingSourceCount() == 0 && cVar.getZombie()) {
                                fVar.k0(cVar);
                            }
                            Unit unit = Unit.f143329a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        public c(f fVar, String key) {
            Intrinsics.j(key, "key");
            this.f27335j = fVar;
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
                B directory = this.f27335j.getDirectory();
                String string = sb2.toString();
                Intrinsics.i(string, "toString(...)");
                list.add(directory.w(string));
                sb2.append(".tmp");
                List<B> list2 = this.dirtyFiles;
                B directory2 = this.f27335j.getDirectory();
                String string2 = sb2.toString();
                Intrinsics.i(string2, "toString(...)");
                list2.add(directory2.w(string2));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> strings) throws IOException {
            throw new IOException("unexpected journal line: " + strings);
        }

        private final K k(int index) throws IOException {
            K kD = this.f27335j.getFileSystem().D(this.cleanFiles.get(index));
            if (this.f27335j.civilizedFileSystem) {
                return kD;
            }
            this.lockingSourceCount++;
            return new a(kD, this.f27335j, this);
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
            if (strings.size() != this.f27335j.getValueCount()) {
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
            f fVar = this.f27335j;
            if (k.f22781b && !Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.f27335j.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.f27335j.getValueCount();
                for (int i10 = 0; i10 < valueCount; i10++) {
                    arrayList.add(k(i10));
                }
                return new d(this.f27335j, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Nv.h.f((K) it.next());
                }
                try {
                    this.f27335j.k0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(InterfaceC14417f writer) throws IOException {
            Intrinsics.j(writer, "writer");
            for (long j10 : this.lengths) {
                writer.writeByte(32).G1(j10);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0018\u00010\rR\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LPv/f$d;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "Lgw/K;", "sources", "", "lengths", "<init>", "(LPv/f;Ljava/lang/String;JLjava/util/List;[J)V", "LPv/f$b;", "LPv/f;", "a", "()LPv/f$b;", "", "index", "b", "(I)Lgw/K;", "", "close", "()V", "Ljava/lang/String;", "J", "c", "Ljava/util/List;", "d", "[J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class d implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long sequenceNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<K> sources;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f27343e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(f fVar, String key, long j10, List<? extends K> sources, long[] lengths) {
            Intrinsics.j(key, "key");
            Intrinsics.j(sources, "sources");
            Intrinsics.j(lengths, "lengths");
            this.f27343e = fVar;
            this.key = key;
            this.sequenceNumber = j10;
            this.sources = sources;
            this.lengths = lengths;
        }

        public final b a() throws IOException {
            return this.f27343e.w(this.key, this.sequenceNumber);
        }

        public final K b(int index) {
            return this.sources.get(index);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator<K> it = this.sources.iterator();
            while (it.hasNext()) {
                Nv.h.f(it.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Pv/f$e", "LQv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends Qv.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // Qv.a
        public long f() {
            f fVar = f.this;
            synchronized (fVar) {
                if (!fVar.initialized || fVar.getClosed()) {
                    return -1L;
                }
                try {
                    fVar.n0();
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
                    InterfaceC14417f interfaceC14417f = fVar.journalWriter;
                    if (interfaceC14417f != null) {
                        Nv.h.f(interfaceC14417f);
                    }
                    fVar.journalWriter = w.b(w.a());
                }
                return -1L;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Pv/f$f", "Lgw/m;", "Lgw/B;", "file", "", "mustCreate", "Lgw/J;", "B", "(Lgw/B;Z)Lgw/J;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Pv.f$f, reason: collision with other inner class name */
    public static final class C0503f extends AbstractC14424m {
        @Override // gw.AbstractC14424m, gw.AbstractC14423l
        public J B(B file, boolean mustCreate) throws IOException {
            Intrinsics.j(file, "file");
            B bP = file.p();
            if (bP != null) {
                d(bP);
            }
            return super.B(file, mustCreate);
        }

        C0503f(AbstractC14423l abstractC14423l) {
            super(abstractC14423l);
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
        o0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return null;
        }
        d dVarR = cVar.r();
        if (dVarR == null) {
            return null;
        }
        this.redundantOpCount++;
        InterfaceC14417f interfaceC14417f = this.journalWriter;
        Intrinsics.g(interfaceC14417f);
        interfaceC14417f.G0(f27295G).writeByte(32).G0(key).writeByte(10);
        if (O()) {
            Qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return dVarR;
    }

    public final synchronized void K() throws IOException {
        try {
            if (k.f22781b && !Thread.holdsLock(this)) {
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
            this.civilizedFileSystem = Nv.h.x(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.m(this.journalFile)) {
                try {
                    b0();
                    Y();
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
                n0();
                InterfaceC14417f interfaceC14417f = this.journalWriter;
                if (interfaceC14417f != null) {
                    Nv.h.f(interfaceC14417f);
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
            n0();
            InterfaceC14417f interfaceC14417f = this.journalWriter;
            Intrinsics.g(interfaceC14417f);
            interfaceC14417f.flush();
        }
    }

    public final synchronized void h0() throws IOException {
        Throwable th2;
        try {
            InterfaceC14417f interfaceC14417f = this.journalWriter;
            if (interfaceC14417f != null) {
                interfaceC14417f.close();
            }
            InterfaceC14417f interfaceC14417fB = w.b(this.fileSystem.B(this.journalFileTmp, false));
            try {
                interfaceC14417fB.G0(f27300z).writeByte(10);
                interfaceC14417fB.G0(f27289A).writeByte(10);
                interfaceC14417fB.G1(this.appVersion).writeByte(10);
                interfaceC14417fB.G1(this.valueCount).writeByte(10);
                interfaceC14417fB.writeByte(10);
                for (c cVar : this.lruEntries.values()) {
                    Intrinsics.i(cVar, "next(...)");
                    c cVar2 = cVar;
                    if (cVar2.getCurrentEditor() != null) {
                        interfaceC14417fB.G0(f27293E).writeByte(32);
                        interfaceC14417fB.G0(cVar2.getKey());
                        interfaceC14417fB.writeByte(10);
                    } else {
                        interfaceC14417fB.G0(f27292D).writeByte(32);
                        interfaceC14417fB.G0(cVar2.getKey());
                        cVar2.s(interfaceC14417fB);
                        interfaceC14417fB.writeByte(10);
                    }
                }
                Unit unit = Unit.f143329a;
                if (interfaceC14417fB != null) {
                    try {
                        interfaceC14417fB.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    th2 = null;
                }
            } catch (Throwable th4) {
                if (interfaceC14417fB != null) {
                    try {
                        interfaceC14417fB.close();
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
                Nv.h.i(this.fileSystem, this.journalFileBackup);
            } else {
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
            }
            InterfaceC14417f interfaceC14417f2 = this.journalWriter;
            if (interfaceC14417f2 != null) {
                Nv.h.f(interfaceC14417f2);
            }
            this.journalWriter = R();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final synchronized boolean j0(String key) throws IOException {
        Intrinsics.j(key, "key");
        K();
        m();
        o0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zK0 = k0(cVar);
        if (zK0 && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zK0;
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
                Nv.h.i(this.fileSystem, b10);
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
            k0(entry);
            return;
        }
        this.redundantOpCount++;
        InterfaceC14417f interfaceC14417f = this.journalWriter;
        Intrinsics.g(interfaceC14417f);
        if (entry.getReadable() || success) {
            entry.o(true);
            interfaceC14417f.G0(f27292D).writeByte(32);
            interfaceC14417f.G0(entry.getKey());
            entry.s(interfaceC14417f);
            interfaceC14417f.writeByte(10);
            if (success) {
                long j11 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j11;
                entry.p(j11);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            interfaceC14417f.G0(f27294F).writeByte(32);
            interfaceC14417f.G0(entry.getKey());
            interfaceC14417f.writeByte(10);
        }
        interfaceC14417f.flush();
        if (this.size > this.maxSize || O()) {
            Qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    @JvmOverloads
    public final synchronized b w(String key, long expectedSequenceNumber) throws IOException {
        Intrinsics.j(key, "key");
        K();
        m();
        o0(key);
        c cVar = this.lruEntries.get(key);
        if (expectedSequenceNumber != f27290B && (cVar == null || cVar.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            InterfaceC14417f interfaceC14417f = this.journalWriter;
            Intrinsics.g(interfaceC14417f);
            interfaceC14417f.G0(f27293E).writeByte(32).G0(key).writeByte(10);
            interfaceC14417f.flush();
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
        Qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public f(AbstractC14423l fileSystem, B directory, int i10, int i11, long j10, Qv.d taskRunner) {
        Intrinsics.j(fileSystem, "fileSystem");
        Intrinsics.j(directory, "directory");
        Intrinsics.j(taskRunner, "taskRunner");
        this.directory = directory;
        this.appVersion = i10;
        this.valueCount = i11;
        this.fileSystem = new C0503f(fileSystem);
        this.maxSize = j10;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.k();
        this.cleanupTask = new e(k.f22782c + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = directory.w(f27297w);
        this.journalFileTmp = directory.w(f27298x);
        this.journalFileBackup = directory.w(f27299y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O() {
        int i10 = this.redundantOpCount;
        return i10 >= 2000 && i10 >= this.lruEntries.size();
    }

    private final InterfaceC14417f R() throws FileNotFoundException {
        return w.b(new h(this.fileSystem.a(this.journalFile), new Function1() { // from class: Pv.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.T(this.f27288a, (IOException) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(f fVar, IOException it) {
        Intrinsics.j(it, "it");
        if (!k.f22781b || Thread.holdsLock(fVar)) {
            fVar.hasJournalErrors = true;
            return Unit.f143329a;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    private final void Y() throws IOException {
        Nv.h.i(this.fileSystem, this.journalFileTmp);
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
                    Nv.h.i(this.fileSystem, cVar.a().get(i10));
                    Nv.h.i(this.fileSystem, cVar.c().get(i10));
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
    private final void b0() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            gw.l r1 = r9.fileSystem
            gw.B r2 = r9.journalFile
            gw.K r1 = r1.D(r2)
            gw.g r1 = gw.w.c(r1)
            java.lang.String r2 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = Pv.f.f27300z     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r2)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L89
            java.lang.String r7 = Pv.f.f27289A     // Catch: java.lang.Throwable -> L5b
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
            java.lang.String r2 = r1.i1()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r9.e0(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb7
        L5d:
            java.util.LinkedHashMap<java.lang.String, Pv.f$c> r2 = r9.lruEntries     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r9.redundantOpCount = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.i2()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r9.h0()     // Catch: java.lang.Throwable -> L5b
            goto L7d
        L70:
            gw.f r0 = r9.journalWriter     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L77
            Nv.h.f(r0)     // Catch: java.lang.Throwable -> L5b
        L77:
            gw.f r0 = r9.R()     // Catch: java.lang.Throwable -> L5b
            r9.journalWriter = r0     // Catch: java.lang.Throwable -> L5b
        L7d:
            kotlin.Unit r0 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: Pv.f.b0():void");
    }

    private final void e0(String line) throws IOException {
        String strSubstring;
        int iP0 = StringsKt.p0(line, ' ', 0, false, 6, null);
        if (iP0 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i10 = iP0 + 1;
        int iP02 = StringsKt.p0(line, ' ', i10, false, 4, null);
        if (iP02 == -1) {
            strSubstring = line.substring(i10);
            Intrinsics.i(strSubstring, "substring(...)");
            String str = f27294F;
            if (iP0 == str.length() && StringsKt.W(line, str, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i10, iP02);
            Intrinsics.i(strSubstring, "substring(...)");
        }
        c cVar = this.lruEntries.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.lruEntries.put(strSubstring, cVar);
        }
        if (iP02 != -1) {
            String str2 = f27292D;
            if (iP0 == str2.length() && StringsKt.W(line, str2, false, 2, null)) {
                String strSubstring2 = line.substring(iP02 + 1);
                Intrinsics.i(strSubstring2, "substring(...)");
                List<String> listA1 = StringsKt.a1(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listA1);
                return;
            }
        }
        if (iP02 == -1) {
            String str3 = f27293E;
            if (iP0 == str3.length() && StringsKt.W(line, str3, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iP02 == -1) {
            String str4 = f27295G;
            if (iP0 == str4.length() && StringsKt.W(line, str4, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + line);
    }

    private final boolean m0() throws IOException {
        for (c cVar : this.lruEntries.values()) {
            Intrinsics.i(cVar, "next(...)");
            c cVar2 = cVar;
            if (!cVar2.getZombie()) {
                k0(cVar2);
                return true;
            }
        }
        return false;
    }

    private final void o0(String key) {
        if (f27291C.j(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    public static /* synthetic */ b z(f fVar, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = f27290B;
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
    public final AbstractC14423l getFileSystem() {
        return this.fileSystem;
    }

    /* renamed from: J, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final boolean k0(c entry) throws IOException {
        InterfaceC14417f interfaceC14417f;
        Intrinsics.j(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (interfaceC14417f = this.journalWriter) != null) {
                interfaceC14417f.G0(f27293E);
                interfaceC14417f.writeByte(32);
                interfaceC14417f.G0(entry.getKey());
                interfaceC14417f.writeByte(10);
                interfaceC14417f.flush();
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
            Nv.h.i(this.fileSystem, entry.a().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.redundantOpCount++;
        InterfaceC14417f interfaceC14417f2 = this.journalWriter;
        if (interfaceC14417f2 != null) {
            interfaceC14417f2.G0(f27294F);
            interfaceC14417f2.writeByte(32);
            interfaceC14417f2.G0(entry.getKey());
            interfaceC14417f2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (O()) {
            Qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void n0() throws IOException {
        while (this.size > this.maxSize) {
            if (!m0()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final void u() throws IOException {
        close();
        Nv.h.h(this.fileSystem, this.directory);
    }
}
