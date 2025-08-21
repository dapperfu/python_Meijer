package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001:\u0001%B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 ¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00142\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00142\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#¢\u0006\u0004\b(\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00107¨\u00069"}, d2 = {"Lcom/bugsnag/android/p0;", "", "Ljava/io/File;", "storageDir", "", "maxStoreCount", "Lcom/bugsnag/android/D0;", "logger", "Lcom/bugsnag/android/p0$a;", "delegate", "<init>", "(Ljava/io/File;ILcom/bugsnag/android/D0;Lcom/bugsnag/android/p0$a;)V", "", "j", "(Ljava/io/File;)Z", "i", "()Z", "", "content", "filename", "", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/bugsnag/android/v0$a;", "streamable", "k", "(Lcom/bugsnag/android/v0$a;)Ljava/lang/String;", "c", "()V", "obj", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "", "e", "()Ljava/util/List;", "", "files", "a", "(Ljava/util/Collection;)V", "storedFiles", "b", "Ljava/io/File;", "h", "()Ljava/io/File;", "I", "Lcom/bugsnag/android/D0;", "g", "()Lcom/bugsnag/android/D0;", "Lcom/bugsnag/android/p0$a;", "getDelegate", "()Lcom/bugsnag/android/p0$a;", "Ljava/util/concurrent/locks/Lock;", "Ljava/util/concurrent/locks/Lock;", "lock", "", "Ljava/util/Collection;", "queuedFiles", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6613p0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File storageDir;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxStoreCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a delegate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lock lock = new ReentrantLock();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Collection<File> queuedFiles = new ConcurrentSkipListSet();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/p0$a;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Ljava/io/File;", "errorFile", "", "context", "", "a", "(Ljava/lang/Exception;Ljava/io/File;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.p0$a */
    public interface a {
        void a(Exception exception, File errorFile, String context);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.p0$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t11).lastModified()));
        }
    }

    public abstract String f(Object obj);

    public final void a(Collection<? extends File> files) {
        this.lock.lock();
        if (files != null) {
            try {
                this.queuedFiles.removeAll(files);
            } finally {
                this.lock.unlock();
            }
        }
    }

    public final void b(Collection<? extends File> storedFiles) {
        this.lock.lock();
        if (storedFiles != null) {
            try {
                this.queuedFiles.removeAll(storedFiles);
                for (File file : storedFiles) {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    public final void c() {
        File[] fileArrListFiles;
        if (!j(this.storageDir) || (fileArrListFiles = this.storageDir.listFiles()) == null || fileArrListFiles.length < this.maxStoreCount) {
            return;
        }
        List<File> listW0 = ArraysKt.W0(fileArrListFiles, new b());
        int length = (fileArrListFiles.length - this.maxStoreCount) + 1;
        int i10 = 0;
        for (File file : listW0) {
            if (i10 == length) {
                return;
            }
            if (!this.queuedFiles.contains(file)) {
                getLogger().g("Discarding oldest error as stored error limit reached: '" + ((Object) file.getPath()) + '\'');
                b(SetsKt.d(file));
                i10++;
            }
        }
    }

    public final void d(String content, String filename) throws Throwable {
        BufferedWriter bufferedWriter;
        if (j(this.storageDir)) {
            c();
            this.lock.lock();
            String absolutePath = new File(this.storageDir, filename).getAbsolutePath();
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    try {
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8"));
                    } catch (Exception e10) {
                        getLogger().b(Intrinsics.q("Failed to close unsent payload writer: ", filename), e10);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bufferedWriter.write(content);
                bufferedWriter.close();
            } catch (Exception e12) {
                e = e12;
                bufferedWriter2 = bufferedWriter;
                File file = new File(absolutePath);
                a aVar = this.delegate;
                if (aVar != null) {
                    aVar.a(e, file, "NDK Crash report copy");
                }
                C6615q0.c(file, getLogger());
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                this.lock.unlock();
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e13) {
                        getLogger().b(Intrinsics.q("Failed to close unsent payload writer: ", filename), e13);
                    }
                }
                this.lock.unlock();
                throw th;
            }
            this.lock.unlock();
        }
    }

    public final List<File> e() {
        File[] fileArrListFiles;
        this.lock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            if (j(this.storageDir) && (fileArrListFiles = this.storageDir.listFiles()) != null) {
                int length = fileArrListFiles.length;
                int i10 = 0;
                while (i10 < length) {
                    File file = fileArrListFiles[i10];
                    i10++;
                    if (file.length() == 0) {
                        if (!file.delete()) {
                            file.deleteOnExit();
                        }
                    } else if (file.isFile() && !this.queuedFiles.contains(file)) {
                        arrayList.add(file);
                    }
                }
            }
            this.queuedFiles.addAll(arrayList);
            this.lock.unlock();
            return arrayList;
        } catch (Throwable th2) {
            this.lock.unlock();
            throw th2;
        }
    }

    /* renamed from: g, reason: from getter */
    protected D0 getLogger() {
        return this.logger;
    }

    /* renamed from: h, reason: from getter */
    public final File getStorageDir() {
        return this.storageDir;
    }

    public final boolean i() {
        if (!this.queuedFiles.isEmpty()) {
            return false;
        }
        String[] list = this.storageDir.list();
        return list == null || list.length == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String k(C6624v0.a streamable) throws Throwable {
        C6624v0 c6624v0;
        Closeable closeable = null;
        if (!j(this.storageDir) || this.maxStoreCount == 0) {
            return null;
        }
        c();
        String absolutePath = new File(this.storageDir, f(streamable)).getAbsolutePath();
        Lock lock = this.lock;
        lock.lock();
        try {
            try {
                c6624v0 = new C6624v0(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8")));
                try {
                    c6624v0.e0(streamable);
                    getLogger().f("Saved unsent payload to disk: '" + ((Object) absolutePath) + '\'');
                    C6615q0.a(c6624v0);
                    this.lock.unlock();
                    return absolutePath;
                } catch (FileNotFoundException e10) {
                    e = e10;
                    getLogger().b("Ignoring FileNotFoundException - unable to create file", e);
                    C6615q0.a(c6624v0);
                    this.lock.unlock();
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    File file = new File(absolutePath);
                    a aVar = this.delegate;
                    if (aVar != null) {
                        aVar.a(e, file, "Crash report serialization");
                    }
                    C6615q0.c(file, getLogger());
                    C6615q0.a(c6624v0);
                    this.lock.unlock();
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = lock;
                C6615q0.a(closeable);
                this.lock.unlock();
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            c6624v0 = null;
        } catch (Exception e13) {
            e = e13;
            c6624v0 = null;
        } catch (Throwable th3) {
            th = th3;
            C6615q0.a(closeable);
            this.lock.unlock();
            throw th;
        }
    }

    public AbstractC6613p0(File file, int i10, D0 d02, a aVar) {
        this.storageDir = file;
        this.maxStoreCount = i10;
        this.logger = d02;
        this.delegate = aVar;
    }

    private final boolean j(File storageDir) {
        try {
            storageDir.mkdirs();
            return true;
        } catch (Exception e10) {
            getLogger().c("Could not prepare file storage directory", e10);
            return false;
        }
    }
}
