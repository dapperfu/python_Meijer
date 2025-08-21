package hh;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.core.source.CameraSettings;
import hh.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f135457a = Pattern.compile(";");

    @TargetApi(15)
    private static List<Camera.Area> a(int i10) {
        int i11 = -i10;
        return Collections.singletonList(new Camera.Area(new Rect(i11, i11, i10, i10), 1));
    }

    private static String b(String str, Collection<String> collection, String... strArr) {
        FS.log_i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        FS.log_i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    FS.log_i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        FS.log_i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void e(Camera.Parameters parameters) {
        f(parameters, 10, 20);
    }

    @TargetApi(15)
    private static String m(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb2.append(area.rect);
            sb2.append(':');
            sb2.append(area.weight);
            sb2.append(' ');
        }
        return sb2.toString();
    }

    private static String n(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static void c(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            FS.log_i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String strB = b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (strB != null) {
            parameters.setSceneMode(strB);
        }
    }

    public static void d(Camera.Parameters parameters, boolean z10) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            float f10 = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z10) {
                    f10 = 1.5f;
                }
                int iRound = Math.round(f10 / exposureCompensationStep);
                float f11 = exposureCompensationStep * iRound;
                int iMax = Math.max(Math.min(iRound, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == iMax) {
                    FS.log_i("CameraConfiguration", "Exposure compensation already set to " + iMax + " / " + f11);
                    return;
                }
                FS.log_i("CameraConfiguration", "Setting exposure compensation to " + iMax + " / " + f11);
                parameters.setExposureCompensation(iMax);
                return;
            }
        }
        FS.log_i("CameraConfiguration", "Camera does not support exposure compensation");
    }

    public static void f(Camera.Parameters parameters, int i10, int i11) {
        int[] next;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        FS.log_i("CameraConfiguration", "Supported FPS ranges: " + n(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    int i12 = next[0];
                    int i13 = next[1];
                    if (i12 >= i10 * 1000 && i13 <= i11 * 1000) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                FS.log_i("CameraConfiguration", "No suitable FPS range?");
                return;
            }
            int[] iArr = new int[2];
            parameters.getPreviewFpsRange(iArr);
            if (Arrays.equals(iArr, next)) {
                FS.log_i("CameraConfiguration", "FPS range already set to " + Arrays.toString(next));
                return;
            }
            FS.log_i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(next));
            parameters.setPreviewFpsRange(next[0], next[1]);
        }
    }

    public static void g(Camera.Parameters parameters, i.a aVar, boolean z10) {
        String strB;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (!z10 && aVar != i.a.AUTO) {
            if (aVar == i.a.CONTINUOUS) {
                strB = b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", CameraSettings.FOCUS_STRATEGY_AUTO);
            } else if (aVar == i.a.INFINITY) {
                strB = b("focus mode", supportedFocusModes, "infinity");
            } else if (aVar == i.a.MACRO) {
                strB = b("focus mode", supportedFocusModes, "macro");
            } else {
                strB = null;
            }
        } else {
            strB = b("focus mode", supportedFocusModes, CameraSettings.FOCUS_STRATEGY_AUTO);
        }
        if (!z10 && strB == null) {
            strB = b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strB != null) {
            if (strB.equals(parameters.getFocusMode())) {
                FS.log_i("CameraConfiguration", "Focus mode already set to " + strB);
                return;
            }
            parameters.setFocusMode(strB);
        }
    }

    @TargetApi(15)
    public static void h(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            FS.log_i("CameraConfiguration", "Old focus areas: " + m(parameters.getFocusAreas()));
            List<Camera.Area> listA = a(HttpResponseStatus.ERROR_BAD_REQUEST);
            FS.log_i("CameraConfiguration", "Setting focus area to : " + m(listA));
            parameters.setFocusAreas(listA);
            return;
        }
        FS.log_i("CameraConfiguration", "Device does not support focus areas");
    }

    public static void i(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            FS.log_i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String strB = b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (strB != null) {
            parameters.setColorEffect(strB);
        }
    }

    @TargetApi(15)
    public static void j(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            FS.log_i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> listA = a(HttpResponseStatus.ERROR_BAD_REQUEST);
            FS.log_i("CameraConfiguration", "Setting metering area to : " + m(listA));
            parameters.setMeteringAreas(listA);
            return;
        }
        FS.log_i("CameraConfiguration", "Device does not support metering areas");
    }

    public static void k(Camera.Parameters parameters, boolean z10) {
        String strB;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z10) {
            strB = b("flash mode", supportedFlashModes, "torch", "on");
        } else {
            strB = b("flash mode", supportedFlashModes, "off");
        }
        if (strB != null) {
            if (strB.equals(parameters.getFlashMode())) {
                FS.log_i("CameraConfiguration", "Flash mode already set to " + strB);
                return;
            }
            FS.log_i("CameraConfiguration", "Setting flash mode to " + strB);
            parameters.setFlashMode(strB);
        }
    }

    @TargetApi(15)
    public static void l(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported()) {
            if (parameters.getVideoStabilization()) {
                FS.log_i("CameraConfiguration", "Video stabilization already enabled");
                return;
            } else {
                FS.log_i("CameraConfiguration", "Enabling video stabilization...");
                parameters.setVideoStabilization(true);
                return;
            }
        }
        FS.log_i("CameraConfiguration", "This device does not support video stabilization");
    }
}
