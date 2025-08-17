package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bugsnag.android.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC6468f0 {

    /* renamed from: a, reason: collision with root package name */
    private final File f63426a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63427b;

    /* renamed from: c, reason: collision with root package name */
    private final Comparator<File> f63428c;

    /* renamed from: d, reason: collision with root package name */
    private final Lock f63429d = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    private final Collection<File> f63430e = new ConcurrentSkipListSet();

    /* renamed from: f, reason: collision with root package name */
    protected final InterfaceC6495t0 f63431f;

    /* renamed from: g, reason: collision with root package name */
    private final a f63432g;

    /* renamed from: com.bugsnag.android.f0$a */
    interface a {
        void a(Exception exc, File file, String str);
    }

    abstract String f(Object obj);

    void a(Collection<File> collection) {
        this.f63429d.lock();
        if (collection != null) {
            try {
                this.f63430e.removeAll(collection);
            } finally {
                this.f63429d.unlock();
            }
        }
    }

    void b(Collection<File> collection) {
        this.f63429d.lock();
        if (collection != null) {
            try {
                this.f63430e.removeAll(collection);
                for (File file : collection) {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            } finally {
                this.f63429d.unlock();
            }
        }
    }

    void c() {
        File[] fileArrListFiles;
        if (!g(this.f63426a) || (fileArrListFiles = this.f63426a.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(fileArrListFiles));
        if (arrayList.size() >= this.f63427b) {
            Collections.sort(arrayList, this.f63428c);
            int i10 = 0;
            while (i10 < arrayList.size() && arrayList.size() >= this.f63427b) {
                File file = (File) arrayList.get(i10);
                if (!this.f63430e.contains(file)) {
                    this.f63431f.g("Discarding oldest error as stored error limit reached: '" + file.getPath() + '\'');
                    b(Collections.singleton(file));
                    arrayList.remove(i10);
                    i10 += -1;
                }
                i10++;
            }
        }
    }

    void d(String str, String str2) throws Throwable {
        InterfaceC6495t0 interfaceC6495t0;
        StringBuilder sb2;
        BufferedWriter bufferedWriter;
        if (g(this.f63426a)) {
            c();
            this.f63429d.lock();
            String absolutePath = new File(this.f63426a, str2).getAbsolutePath();
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8"));
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bufferedWriter.write(str);
                try {
                    bufferedWriter.close();
                } catch (Exception e11) {
                    e = e11;
                    interfaceC6495t0 = this.f63431f;
                    sb2 = new StringBuilder();
                    sb2.append("Failed to close unsent payload writer: ");
                    sb2.append(str2);
                    interfaceC6495t0.b(sb2.toString(), e);
                    this.f63429d.unlock();
                }
            } catch (Exception e12) {
                e = e12;
                bufferedWriter2 = bufferedWriter;
                File file = new File(absolutePath);
                a aVar = this.f63432g;
                if (aVar != null) {
                    aVar.a(e, file, "NDK Crash report copy");
                }
                C6472h0.c(file, this.f63431f);
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e13) {
                        e = e13;
                        interfaceC6495t0 = this.f63431f;
                        sb2 = new StringBuilder();
                        sb2.append("Failed to close unsent payload writer: ");
                        sb2.append(str2);
                        interfaceC6495t0.b(sb2.toString(), e);
                        this.f63429d.unlock();
                    }
                }
                this.f63429d.unlock();
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e14) {
                        this.f63431f.b("Failed to close unsent payload writer: " + str2, e14);
                    }
                }
                this.f63429d.unlock();
                throw th;
            }
            this.f63429d.unlock();
        }
    }

    List<File> e() {
        File[] fileArrListFiles;
        this.f63429d.lock();
        try {
            ArrayList arrayList = new ArrayList();
            if (g(this.f63426a) && (fileArrListFiles = this.f63426a.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    if (file.length() == 0) {
                        if (!file.delete()) {
                            file.deleteOnExit();
                        }
                    } else if (file.isFile() && !this.f63430e.contains(file)) {
                        arrayList.add(file);
                    }
                }
            }
            this.f63430e.addAll(arrayList);
            this.f63429d.unlock();
            return arrayList;
        } catch (Throwable th2) {
            this.f63429d.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    String h(C6482m0.a aVar) throws Throwable {
        C6482m0 c6482m0;
        Closeable closeable = null;
        if (!g(this.f63426a) || this.f63427b == 0) {
            return null;
        }
        c();
        String absolutePath = new File(this.f63426a, f(aVar)).getAbsolutePath();
        Lock lock = this.f63429d;
        lock.lock();
        try {
            try {
                c6482m0 = new C6482m0(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8")));
                try {
                    c6482m0.e0(aVar);
                    this.f63431f.f("Saved unsent payload to disk: '" + absolutePath + '\'');
                    C6472h0.a(c6482m0);
                    this.f63429d.unlock();
                    return absolutePath;
                } catch (FileNotFoundException e10) {
                    e = e10;
                    this.f63431f.b("Ignoring FileNotFoundException - unable to create file", e);
                    C6472h0.a(c6482m0);
                    this.f63429d.unlock();
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    File file = new File(absolutePath);
                    a aVar2 = this.f63432g;
                    if (aVar2 != null) {
                        aVar2.a(e, file, "Crash report serialization");
                    }
                    C6472h0.c(file, this.f63431f);
                    C6472h0.a(c6482m0);
                    this.f63429d.unlock();
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = lock;
                C6472h0.a(closeable);
                this.f63429d.unlock();
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            c6482m0 = null;
        } catch (Exception e13) {
            e = e13;
            c6482m0 = null;
        } catch (Throwable th3) {
            th = th3;
            C6472h0.a(closeable);
            this.f63429d.unlock();
            throw th;
        }
    }

    AbstractC6468f0(File file, int i10, Comparator<File> comparator, InterfaceC6495t0 interfaceC6495t0, a aVar) {
        this.f63427b = i10;
        this.f63428c = comparator;
        this.f63431f = interfaceC6495t0;
        this.f63432g = aVar;
        this.f63426a = file;
        g(file);
    }

    private boolean g(File file) {
        try {
            file.mkdirs();
            return true;
        } catch (Exception e10) {
            this.f63431f.c("Could not prepare file storage directory", e10);
            return false;
        }
    }
}
