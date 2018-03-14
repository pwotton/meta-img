inherit kernel
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LINUX_VERSION ?= "4.16"
LINUX_RC ?= "-rc5"
#LINUX_VERSION_EXTENSION_append = "${LINUX_RC}"

PV = "${LINUX_VERSION}${LINUX_RC}"
#KERNEL_VERSION_SANITY_SKIP="1"

SRCBRANCH = "v${LINUX_VERSION}"
SRCREV = "${AUTOREV}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=git"


LINUX_VERSION_EXTENSION ?= "-ci40+${SRCREV}"

COMPATIBLE_MACHINE = "ci40"
KBUILD_DEFCONFIG = "pistachio_defconfig"
KCONFIG_MODE = "--alldefconfig"

KERNEL_DEVICETREE = "img/pistachio_marduk.dtb"
KERNEL_EXTRA_ARGS = "dtbs"
KMACHINE = "pistachio"
