Protobuf Installation

# Socket-Programming

This project demonstrates a basic client-server communication using sockets and Protocol Buffers (protobuf) for serialization and deserialization. Here I use ProtoBuf for faster serialization and deserialization process instead of conventional serializer.

## Installing Protocol Buffers

To get started, you need to install Protocol Buffers on your system. Follow the steps below to install protobuf version 3.19.1.

### Step-by-Step Installation Guide

1. **Update your package list:**
    ```sh
    sudo apt update
    ```

2. **Install the required packages:**
    ```sh
    sudo apt install autoconf automake libtool curl make g++ unzip
    ```

3. **Download the Protocol Buffers source code:**
    ```sh
    curl -OL https://github.com/protocolbuffers/protobuf/releases/download/v3.19.1/protobuf-all-3.19.1.tar.gz
    ```

4. **Extract the downloaded tarball:**
    ```sh
    tar -xzf protobuf-all-3.19.1.tar.gz
    cd protobuf-3.19.1
    ```

5. **Configure the build environment:**
    ```sh
    ./configure
    ```

6. **Compile the source code:**
    ```sh
    make
    ```

7. **Run tests to ensure everything is set up correctly:**
    ```sh
    make check
    ```

8. **Install the compiled binaries:**
    ```sh
    sudo make install
    sudo ldconfig
    ```

9. **Verify the installation:**
    ```sh
    protoc --version
    ```

### Troubleshooting

If you encounter issues with the installation, particularly related to library paths, follow these additional steps:

1. **Export the library path:**
    ```sh
    export LD_LIBRARY_PATH=/usr/local/lib:$LD_LIBRARY_PATH
    ```

2. **Persist the library path in your bash profile:**
    ```sh
    echo 'export LD_LIBRARY_PATH=/usr/local/lib:$LD_LIBRARY_PATH' >> ~/.bashrc
    source ~/.bashrc
    ```

3. **Verify the installation again:**
    ```sh
    protoc --version
    ```

Following these steps should ensure that Protocol Buffers is installed correctly on your system.

## Running the Project

To run this project, ensure that you have Maven installed and configured. Then, use the following command to build the project:

```sh
mvn clean install
