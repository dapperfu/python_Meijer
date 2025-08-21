package a3;

import a3.M;
import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface C extends M {

    public interface a {
        C a(Context context, C5653j c5653j, InterfaceC5656m interfaceC5656m, M.a aVar, Executor executor, K k10, List<Object> list, long j10) throws VideoFrameProcessingException;

        boolean b();
    }

    void c(long j10);
}
