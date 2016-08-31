package fr.bmartel.fadecandy.listener;

import fr.bmartel.android.fadecandy.model.UsbItem;

public interface ISingletonListener {

    void onServerStart();

    void onServerClose();

    void onUsbDeviceAttached(UsbItem usbItem);

    void onUsbDeviceDetached(UsbItem usbItem);

}
