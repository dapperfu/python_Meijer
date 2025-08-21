package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    private final InternalRewinder f64600a;

    private static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f64601a;

        ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f64601a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f64601a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f64601a = parcelFileDescriptor;
        }
    }

    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() throws IOException {
        return this.f64600a.rewind();
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f64600a = new InternalRewinder(parcelFileDescriptor);
    }
}
