package fsimpl;

import com.fullstory.util.Log;
import java.io.File;

/* renamed from: fsimpl.ef, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14186ef {

    /* renamed from: a, reason: collision with root package name */
    private Thread f133386a;

    /* renamed from: b, reason: collision with root package name */
    private E f133387b;

    public C14186ef(E e10) {
        this.f133387b = e10;
    }

    private int a(File file, int i10) throws InterruptedException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            Log.e("Unexpected error reading directory " + file.getAbsolutePath());
            return i10;
        }
        for (File file2 : fileArrListFiles) {
            i10++;
            if (i10 % 100 == 0) {
                Thread.sleep(1000L);
            }
            if (file2.isDirectory()) {
                i10 = a(file2, i10);
            }
            if (!file2.delete()) {
                Log.e("Unexpectedly unable to remove file " + file2.getAbsolutePath());
                file2.deleteOnExit();
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() throws InterruptedException {
        while (true) {
            int i10 = 0;
            while (!Thread.interrupted()) {
                try {
                    a(this.f133387b.b(), 0);
                    try {
                        Thread.sleep(10000L);
                    } catch (InterruptedException e10) {
                    }
                } catch (Throwable th2) {
                    i10++;
                    if (i10 > 3) {
                        try {
                            Thread.sleep(10000L);
                            return;
                        } catch (InterruptedException e11) {
                            return;
                        }
                    }
                    try {
                        Thread.sleep(10000L);
                    } catch (InterruptedException e12) {
                    }
                }
            }
            return;
        }
    }

    public void a() {
        fM fMVar = new fM(new RunnableC14187eg(this), "fs-deleter");
        this.f133386a = fMVar;
        fMVar.start();
    }
}
