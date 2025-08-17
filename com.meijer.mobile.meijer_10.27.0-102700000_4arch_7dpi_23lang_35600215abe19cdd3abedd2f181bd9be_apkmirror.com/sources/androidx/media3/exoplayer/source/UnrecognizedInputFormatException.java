package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import java.util.List;
import x3.N;

/* loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* renamed from: c, reason: collision with root package name */
    public final Uri f56789c;

    /* renamed from: d, reason: collision with root package name */
    public final Ce.L<N> f56790d;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends N> list) {
        super(str, null, false, 1);
        this.f56789c = uri;
        this.f56790d = Ce.L.s(list);
    }
}
