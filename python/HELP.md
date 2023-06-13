# Help

## Running the tests

We use [pytest][pytest: Getting Started Guide] as our website test runner.
You will need to install `pytest` on your development machine if you want to run tests for the Python track locally.
You should also install the following `pytest` plugins:

- [pytest-cache][pytest-cache]
- [pytest-subtests][pytest-subtests]

Extended information can be found in our website [Python testing guide][Python track tests page].


### Running Tests

Test files usually end in `_test.py`, and are the same tests that run on the website when a solution is uploaded.

Linux/MacOS
```bash
$ cd {path/to/exercise-folder-location}
```

Windows
```powershell
PS C:\Users\foobar> cd {path\to\exercise-folder-location}
```

<br>

Next, run the `pytest` command in your terminal
Linux/MacOS
```bash
$ python3 -m pytest run_length_encoding_test.py
==================== 7 passed in 0.08s ====================
```

Windows
```powershell
PS C:\Users\foobar> py -m pytest 
==================== 7 passed in 0.08s ====================
```


### Common options
- `-o` : override default `pytest.ini` (_you can use this to avoid marker warnings_)
- `-v` : enable verbose output.
- `-x` : stop running tests on first failure.
- `--ff` : run failures from previous test before running other test cases.

For additional options, use `python3 -m pytest -h` or `py -m pytest -h`.


[Pytest: Getting Started Guide]: https://docs.pytest.org/en/latest/getting-started.html
[Python track tools page]: https://exercism.org/docs/tracks/python/tools
[Python track tests page]: https://exercism.org/docs/tracks/python/tests
[pytest-cache]:http://pythonhosted.org/pytest-cache/
[pytest-subtests]:https://github.com/pytest-dev/pytest-subtests
[pytest.ini]: https://github.com/exercism/python/blob/main/pytest.ini
[pytest: configuration file formats]: https://docs.pytest.org/en/6.2.x/customize.html#configuration-file-formats
[pytest: marking test functions with attributes]: https://docs.pytest.org/en/6.2.x/mark.html#raising-errors-on-unknown-marks
[pytest: working with custom markers]: https://docs.pytest.org/en/6.2.x/example/markers.html#working-with-custom-markers
